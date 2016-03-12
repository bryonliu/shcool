package top.bryon.pb.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import top.bryon.pb.R;

/**
 * Created by bryonliu on 2016/3/12.
 */
public class ItemView extends LinearLayout {
    private LayoutInflater inflater;

    @Bind(R.id.division)
    View mDivision;

    @Bind(R.id.iv_icon)
    ImageView mIcon;

    @Bind(R.id.tv_name)
    TextView mName;

    public ItemView(Context context) {
        super(context);
        initView();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.widget_item_view, this, true);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    public void init(boolean divisonVIsable, int iconResId, int nameResId) {
        mDivision.setVisibility(divisonVIsable ? VISIBLE : GONE);
        mIcon.setImageResource(iconResId);
        mName.setText(nameResId);
    }

}
