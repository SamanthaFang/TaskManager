package a13045249.c347.soi.rp.edu.sg.taskmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TaskReminderReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Task task = (Task) intent.getSerializableExtra("task");
        Intent intent1 = new Intent(context, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(context, 0, intent1, 0);
        Notification n = new Notification.Builder(context)
                .setContentTitle(task.gettaskname()).setContentText("Task")
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentIntent(pIntent).setAutoCancel(true)
                .build();

    }
}

