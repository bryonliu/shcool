package top.bryon.pb.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.bryon.pb.R;

/**
 * Created by bryonliu on 2016/3/12.
 */
public class TopTitleView extends LinearLayout {

    private LayoutInflater inflater;

    @Bind(R.id.tv_fresh_news)
    TextView tvFreshNews;

    @Bind(R.id.tv_contacts)
    TextView tvContacts;

    @Bind(R.id.btn_search)
    Button btnSearch;

    @Bind(R.id.ev_seach)
    EditText etSearch;

    @Bind(R.id.tv_app_name)
    TextView tvAppName;


    private View rootView;

    public TopTitleView(Context context) {
        this(context, null);
    }

    public TopTitleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TopTitleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rootView = inflater.inflate(R.layout.widget_top_title_view, this, true);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    public void setTextViewVisble() {
        tvFreshNews.setVisibility(VISIBLE);
        tvContacts.setVisibility(VISIBLE);
        onCLickFreshNews();
    }

    public void setSearchVisble() {
        etSearch.setVisibility(VISIBLE);
        btnSearch.setVisibility(VISIBLE);
    }

    public void setAppName() {
        tvAppName.setVisibility(VISIBLE);
    }

    @OnClick({R.id.tv_contacts, R.id.tv_fresh_news})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tv_contacts:
                onClickContacts();
                break;
            case R.id.tv_fresh_news:
                onCLickFreshNews();
                break;
            default:
                break;
        }
    }

    private void onCLickFreshNews() {
        tvContacts.setTextColor(getResources().getColor(R.color.blue_gray));
        tvFreshNews.setTextColor(getResources().getColor(R.color.white));
    }

    private void onClickContacts() {
        tvContacts.setTextColor(getResources().getColor(R.color.white));
        tvFreshNews.setTextColor(getResources().getColor(R.color.blue_gray));
    }
}
