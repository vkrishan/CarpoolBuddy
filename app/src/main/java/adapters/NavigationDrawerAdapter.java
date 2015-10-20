package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carpool.vkrishax.carpool.R;

import java.util.Collections;
import java.util.List;

import model.NavDrawerItem;

/**
 * Created by vkrishax on 9/30/15.
 * This is the adapter class to inflate Navigation Drawer
 *
 * As the RecyclerView is customized, we need an adapter class to render the custom xml layout.
 * This adapter class inflates nav_drawer_row.xml and renders the RecycleView drawer menu.
 *
 */
public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    List<NavDrawerItem> data = Collections.emptyList();         // Y empty list ?????

    private LayoutInflater inflater;
    private Context context;

    // Constructor
    public NavigationDrawerAdapter(Context context, List<NavDrawerItem> data){
        // assigning context, inflater, data here....

        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    // delete method
    public void delete(int position){
        data.remove(position);
        notifyItemRemoved(position);
    }

    // getItemCount()
    public int getItemCount(){
        return data.size();
    }

    // onCreateViewHolder
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){ // VIewgroup parent, viewType ??????
        View view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    // onBindViewHolder
    public void onBindViewHolder(MyViewHolder holder, int position){
        NavDrawerItem current = data.get(position);
        holder.title.setText(current.getTitle());
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;

        public MyViewHolder(View itemView){
            super(itemView);            // super ??????
            title = (TextView) itemView.findViewById(R.id.title); //  itemView.findViewById...????
        }
    }

}
