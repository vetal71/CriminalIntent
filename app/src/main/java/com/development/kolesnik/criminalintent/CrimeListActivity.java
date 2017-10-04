package com.development.kolesnik.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by kolesnik on 04.10.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
