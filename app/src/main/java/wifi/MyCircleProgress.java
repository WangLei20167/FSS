package wifi;

import android.widget.TextView;

import com.github.lzyzsd.circleprogress.CircleProgress;

/**
 * 用于把ip和圆形进度球绑定
 * Created by Administrator on 2017/5/29 0029.
 */

public class MyCircleProgress {
    private String ip;
    private CircleProgress circleProgress;
    private TextView textView;

    public String getIp() {
        return ip;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CircleProgress getCircleProgress() {
        return circleProgress;
    }

    public void setCircleProgress(CircleProgress circleProgress) {
        this.circleProgress = circleProgress;
    }
}
