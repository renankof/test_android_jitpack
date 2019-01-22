import android.util.Log;

public class MyLog {

    private final String TAG = "Logger";

    public void error(String message) {
        error(TAG, message);
    }

    public void error(String tag, String message) {
        Log.e(tag, message);
    }
}
