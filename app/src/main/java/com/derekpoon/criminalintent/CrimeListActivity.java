package com.derekpoon.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by derekpoon on 29/12/2017.
 */

//controller class

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
