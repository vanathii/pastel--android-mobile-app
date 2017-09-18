package pastel.com.pastel.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pastel.com.pastel.Dashboard.activity_menu;
import pastel.com.pastel.Menu.beverages_activity;
import pastel.com.pastel.Menu.cake_activity;
import pastel.com.pastel.Menu.chocolate_activity;
import pastel.com.pastel.Menu.confectionaries_activity;
import pastel.com.pastel.Menu.dessert_activity;
import pastel.com.pastel.Menu.puff_activity;
import pastel.com.pastel.R;

import static android.content.ContentValues.TAG;

/**
 * Created by sans on 22-02-2017.
 */

public class List_adapter extends RecyclerView.Adapter {
    private Context mContext;
    ArrayList<activity_menu.List> menuList;
    private int lastPosition = -1;

    public List_adapter(Context mContext, ArrayList<activity_menu.List> menuList) {
        this.mContext = mContext;
        this.menuList = menuList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.menu_list, viewGroup,false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        UserViewHolder holder = (UserViewHolder) viewHolder;
        holder.ivMenu.setImageResource(menuList.get(i).img);
        holder.tvName.setText(menuList.get(i).menuName);
        setAnimation(holder.itemView, i);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                Log.e(TAG, "onClick: "+getItemCount() );
                switch (i){
                    case 0:
                        intent =  new Intent(mContext, cake_activity.class);
                        break;
                    case 1:
                        intent =  new Intent(mContext, dessert_activity.class);
                        break;
                    case 2:
                        intent =  new Intent(mContext, chocolate_activity.class);
                        break;
                    case 3:
                        intent =  new Intent(mContext, confectionaries_activity.class);
                        break;
                    case 4:
                        intent =  new Intent(mContext, puff_activity.class);
                        break;
                    case 5:
                        intent =  new Intent(mContext, beverages_activity.class);
                        break;
                    default:
                        intent =  new Intent(mContext, cake_activity.class);
                        break;
                }
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }
    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.slide_in_right);
            animation.setDuration(1000);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivMenu;
        private TextView tvName;

        public UserViewHolder(View itemView) {
            super(itemView);
            ivMenu = (ImageView) itemView.findViewById(R.id.menu_bg);
            tvName = (TextView) itemView.findViewById(R.id.textView4);
        }
    }

}