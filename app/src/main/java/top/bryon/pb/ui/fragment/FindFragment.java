package top.bryon.pb.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import top.bryon.pb.R;
import top.bryon.pb.ui.widget.ItemView;
import top.bryon.pb.ui.widget.TopTitleView;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class FindFragment extends BaseFragment {
    @Bind(R.id.topView)
    TopTitleView topTitleView;

    @Bind(R.id.it_hot)
    ItemView mItemHot;

    @Bind(R.id.it_nearby)
    ItemView mItemNearByPerson;

    @Bind(R.id.it_game)
    ItemView mGame;

    @Bind(R.id.it_library)
    ItemView mItemlibrary;

    @Bind(R.id.it_pie)
    ItemView mItemPie;

    @Override
    public View onCreateFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_find, null);
        return rootView;
    }

    @Override
    public void initView() {
        topTitleView.setSearchVisble();
        mItemNearByPerson.init(true, R.drawable.ic_nearby_person, R.string.nearby_person);
        mItemlibrary.init(true, R.drawable.ic_library, R.string.libary);
        mItemHot.init(true, R.drawable.ic_hot, R.string.hot);
        mGame.init(true, R.drawable.ic_game, R.string.game);
        mItemPie.init(true, R.drawable.ic_pie, R.string.pie);
    }
}
