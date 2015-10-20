package com.carpool.vkrishax.carpool;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import model.NavDrawerItem;

public class FragmentDrawer extends Fragment {

    private static String TAG = FragmentDrawer.class.getSimpleName();

    private FragmentDrawerListener drawerListener;
    private static String[] titles = null;


    public FragmentDrawer(){

    }


    public void setDrawerListener(FragmentDrawerListener listener){
        this.drawerListener = listener;
    }

    // Populating data in Navigation Drawer List
    public static List<NavDrawerItem> getData(){

        List<NavDrawerItem> data = new ArrayList<>();

        for(int i=0; i< titles.length; i++ ){
            NavDrawerItem navItem = new NavDrawerItem();
            navItem.setTitle(titles[i]);
            data.add(navItem);
        }
    return data;
    }


    //  onCreate()
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        titles = getActivity().getResources().getStringArray(R.array.NavMenu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {






        return null;
    }




    //  setUp


    //  ClickListener interface


    //



    // FragmentDrawerListener inteface
    public interface FragmentDrawerListener{
        public void onDrawerItemSelected(View view, int position);
    }



}
