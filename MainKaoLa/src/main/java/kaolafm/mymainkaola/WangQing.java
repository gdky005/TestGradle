package kaolafm.mymainkaola;

import android.content.Context;
import android.util.Log;

/**
 * Created by WangQing on 15/5/12.
 */
public class WangQing {

    public WangQing() {
        Log.i("TAG", "WangQing");
    }

    public String getName() {
        return WangQing.class.getSimpleName();
    }

    public String getYou(String name) {

        return "你的名字是：" + name;
    }

    public String getResName(Context context) {

        return "资源 Res 名字是：" + context.getResources().getString(R.string.system_name);
    }

    public static String getHer(String name) {

        return "Ta 的名字是：" + name;
    }
}
