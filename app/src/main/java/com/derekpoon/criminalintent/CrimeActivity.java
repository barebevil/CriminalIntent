package com.derekpoon.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID =
            "com.bignerdranch.android.criminalintent.crime_id";

    //tell CrimeFragment which Crime to display by passing the crime ID as am Intent extra
    //In this case, you are calling putExtra(String, Serializable) because UUID is a Serializable object.
    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        /*
//        adds a fragment to an activity in code
//         */
//
//        //get the fragment manager
//        //import support Fragmentmanager if using support libraries
//        FragmentManager fm = getSupportFragmentManager();
//
//        //when you retrieve the CrimeFragment from the FragmentManager, you ask it by
//        //container view ID
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        //creates and commits a fragment transaction
//        //after commit, the CrimeActivity now hosts the CrimeFragment
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            fm.beginTransaction()
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }
//    }
    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

}

