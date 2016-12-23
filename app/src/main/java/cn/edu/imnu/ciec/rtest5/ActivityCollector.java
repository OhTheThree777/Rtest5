package cn.edu.imnu.ciec.rtest5;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP301 on 2016/12/21.
 */

public class ActivityCollector {
    public static List<Activity> activitiyList =new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activitiyList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activitiyList.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activitiyList){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
