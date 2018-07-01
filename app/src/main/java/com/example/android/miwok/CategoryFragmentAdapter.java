package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.ColorsFragment;
import com.example.android.miwok.FamilyMembersFragment;
import com.example.android.miwok.NumbersFragment;
import com.example.android.miwok.PhrasesFragment;

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new NumbersFragment();
        } else if(position == 1) {
            return new FamilyMembersFragment();
        } else if(position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getResources().getString(R.string.category_numbers);
        } else if(position == 1){
            return mContext.getResources().getString(R.string.category_family);
        } else if(position == 2){
            return mContext.getResources().getString(R.string.category_colors);
        } else {
            return mContext.getResources().getString(R.string.category_phrases);
        }
    }
}
