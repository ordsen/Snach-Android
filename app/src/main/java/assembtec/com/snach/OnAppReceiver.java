/**
 * Copyright 2015 Giorgio Gross
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package assembtec.com.snach;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import assembtec.com.snach_core_lib.SnachExtras;

/**
 * Created by Giorgio on 16.05.15.
 */
public class OnAppReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        /**
         * Called when an app wants to be added to the Snach screens
         */
        if(SnachExtras.INTENT_ACTION_SNACH_SCREEN_SETUP.equals(intent.getAction())){
            intent.putExtra(Globals.ADD_NEW_APP, true);

            Intent launcherIntent = new Intent(context, AppsActivity.class);
            launcherIntent.putExtras(intent.getExtras());
            context.startActivity(launcherIntent);

        }
    }
}
