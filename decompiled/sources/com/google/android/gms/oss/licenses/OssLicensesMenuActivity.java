package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.io.InputStream;
import o.OnPlacedModifier;
import o.div7Ah8Wj8;
import o.getOnPlaced;
import o.isInfiniteannotations;
import o.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;

/* JADX INFO: loaded from: classes2.dex */
public final class OssLicensesMenuActivity extends AppCompatActivity {
    private static String MediaBrowserCompatMediaItem;
    private getOnPlaced MediaDescriptionCompat;
    private boolean MediaSessionCompatQueueItem;

    public static boolean read(Context context, String str) {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            boolean z = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaDescriptionCompat = getOnPlaced.IconCompatParcelizer(this);
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(this, null, 3);
        SentryUUID.read(getWindow(), true);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        this.MediaSessionCompatQueueItem = read(this, "third_party_licenses") && read(this, "third_party_license_metadata");
        if (MediaBrowserCompatMediaItem == null) {
            Intent intent = getIntent();
            if (intent.hasExtra(PushNotificationParserObj.TITLE_KEY)) {
                MediaBrowserCompatMediaItem = intent.getStringExtra(PushNotificationParserObj.TITLE_KEY);
                SentryLogcatAdapter.IconCompatParcelizer("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = MediaBrowserCompatMediaItem;
        if (str != null) {
            setTitle(str);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().IconCompatParcelizer(true);
        }
        String strWrite = this.MediaDescriptionCompat.write(getPackageName());
        OnPlacedModifier onPlacedModifierRemoteActionCompatParcelizer = getOnPlaced.RemoteActionCompatParcelizer(this, strWrite);
        String str2 = onPlacedModifierRemoteActionCompatParcelizer.IconCompatParcelizer;
        Resources resources = onPlacedModifierRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (!this.MediaSessionCompatQueueItem) {
            if (bundle == null) {
                getOnPlaced.IconCompatParcelizer(this);
                int identifier = resources.getIdentifier("license_fragment_container", "id", str2);
                if (((zzc) getSupportFragmentManager().findFragmentById(identifier)) == null) {
                    zzc zzcVar = new zzc();
                    div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(supportFragmentManager);
                    isinfiniteannotations.read(identifier, zzcVar, null, 1);
                    isinfiniteannotations.RemoteActionCompatParcelizer();
                    return;
                }
                return;
            }
            return;
        }
        if (bundle == null) {
            getOnPlaced.IconCompatParcelizer(this);
            int identifier2 = resources.getIdentifier("license_fragment_container", "id", str2);
            if (((zzp) getSupportFragmentManager().findFragmentById(identifier2)) == null) {
                zzp zzpVar = new zzp();
                if (strWrite != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("license_activity_package_name", strWrite);
                    zzpVar.setArguments(bundle2);
                }
                div7Ah8Wj8 supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                isInfiniteannotations isinfiniteannotations2 = new isInfiniteannotations(supportFragmentManager2);
                isinfiniteannotations2.read(identifier2, zzpVar, null, 1);
                isinfiniteannotations2.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
