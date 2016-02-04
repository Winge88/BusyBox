/*
 * Copyright (C) 2016 Jared Rummler <jared.rummler@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jrummyapps.packagemanager.activities;

import android.app.Fragment;

import com.jrummyapps.android.preferences.activities.MainPreferenceActivity;
import com.jrummyapps.packagemanager.R;
import com.jrummyapps.packagemanager.fragments.MainPreferenceFragment;

public class SettingsActivity extends MainPreferenceActivity {

  @Override protected Fragment getFragment(int position) {
    int stringId = getStringId(position);
    if (stringId == R.string.settings) {
      return new MainPreferenceFragment();
    }
    return super.getFragment(position);
  }

}
