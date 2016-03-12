package top.bryon.pb.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import top.bryon.pb.R;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class CategoryRecycleViewAdapter extends RecyclerView.Adapter<CategoryRecycleViewAdapter.ItemViewHolder> {
    private final Context mContext;

    private String[] mCategorys;
    private final LayoutInflater mLayoutInflater;

    public CategoryRecycleViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mCategorys = mContext.getResources().getStringArray(R.array.outside_category);
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(mLayoutInflater.inflate(R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.tvCategory.setText(mCategorys[position]);
    }

    @Override
    public int getItemCount() {
        return mCategorys != null ? mCategorys.length : 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_category)
        TextView tvCategory;

        public ItemViewHolder(View rootView) {
            super(rootView);
            ButterKnife.bind(this, rootView);
        }
    }
}
