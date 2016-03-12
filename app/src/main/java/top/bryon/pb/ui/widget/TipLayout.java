package top.bryon.pb.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import top.bryon.pb.R;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class TipLayout extends LinearLayout {

    private TextView tvTip;
    private ImageView ivContain;

    private LayoutInflater inflater;

    public TipLayout(Context context) {
        this(context, null);
    }

    public TipLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TipLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.widget_tip_layout, this, true);

        ivContain = (ImageView) findViewById(R.id.iv_contain);

        tvTip = (TextView) findViewById(R.id.tv_tip);
    }

    public void setTip(String tip) {
        tvTip.setText(tip);
    }

    public void setContainDrawable(int resid) {
        ivContain.setImageResource(resid);
    }


}
