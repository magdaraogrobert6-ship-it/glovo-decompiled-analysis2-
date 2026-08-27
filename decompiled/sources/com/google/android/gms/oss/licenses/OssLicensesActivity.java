package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.internal.oss_licenses.zzg;
import com.google.android.gms.stats.zza;
import com.google.android.gms.tasks.zzw;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.OnPlacedElement;
import o.OnPlacedModifier;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.forceRecomposeChildren;
import o.getOnPlaced;
import o.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
import o.setActive;
import o.setCompositionContext;

/* JADX INFO: loaded from: classes2.dex */
public final class OssLicensesActivity extends AppCompatActivity {
    private zzg MediaBrowserCompatMediaItem;
    OnPlacedModifier MediaDescriptionCompat;
    private getOnPlaced PlaybackStateCompatCustomAction;
    private String MediaSessionCompatQueueItem = "";
    private ScrollView RatingCompat = null;
    private TextView ParcelableVolumeInfo = null;
    private int PlaybackStateCompat = 0;

    public final /* synthetic */ ScrollView IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final /* synthetic */ TextView RemoteActionCompatParcelizer() {
        return this.ParcelableVolumeInfo;
    }

    public final /* synthetic */ int serializer() {
        return this.PlaybackStateCompat;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.ParcelableVolumeInfo;
        if (textView == null || this.RatingCompat == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.ParcelableVolumeInfo.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.RatingCompat.getScrollY())));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(this, null, 3);
        SentryUUID.read(getWindow(), true);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        this.ParcelableVolumeInfo = textView;
        textView.setText(getString(R.string.license_is_loading));
        this.PlaybackStateCompatCustomAction = getOnPlaced.IconCompatParcelizer(this);
        this.MediaBrowserCompatMediaItem = (zzg) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().read(this.MediaBrowserCompatMediaItem.serializer);
            getSupportActionBar().MediaSessionCompatQueueItem();
            getSupportActionBar().IconCompatParcelizer(true);
            getSupportActionBar().PlaybackStateCompat();
        }
        OnPlacedModifier onPlacedModifierRemoteActionCompatParcelizer = getOnPlaced.RemoteActionCompatParcelizer(this, this.PlaybackStateCompatCustomAction.write(getPackageName()));
        this.MediaDescriptionCompat = onPlacedModifierRemoteActionCompatParcelizer;
        this.RatingCompat = (ScrollView) findViewById(onPlacedModifierRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.getIdentifier("license_activity_scrollview", "id", onPlacedModifierRemoteActionCompatParcelizer.IconCompatParcelizer));
        OnPlacedModifier onPlacedModifier = this.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = (TextView) findViewById(onPlacedModifier.RemoteActionCompatParcelizer.getIdentifier("license_activity_textview", "id", onPlacedModifier.IconCompatParcelizer));
        getOnPlaced getonplaced = this.PlaybackStateCompatCustomAction;
        zzg zzgVar = this.MediaBrowserCompatMediaItem;
        getonplaced.getClass();
        try {
            OnPlacedElement onPlacedElement = getonplaced.IconCompatParcelizer;
            zzw zzwVar = onPlacedElement.read(0, new zzh(onPlacedElement, zzgVar));
            forceRecomposeChildren forcerecomposechildren = new forceRecomposeChildren();
            forcerecomposechildren.write = zzwVar;
            zzwVar.addOnCompleteListener(setActive.INSTANCE, new PinnableContainerKtLocalPinnableContainer1(8, forcerecomposechildren));
            str = (String) forcerecomposechildren.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            SentryLogcatAdapter.write("OssLicenses", "Failed to get license detail from OssLicensesClient", e);
            str = "";
        }
        this.MediaSessionCompatQueueItem = str;
        if (str == null || str.isEmpty()) {
            zzg zzgVar2 = this.MediaBrowserCompatMediaItem;
            this.MediaSessionCompatQueueItem = setCompositionContext.serializer(this, "third_party_licenses", zzgVar2.RemoteActionCompatParcelizer, zzgVar2.read);
        }
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = getString(R.string.license_content_error);
        }
        this.ParcelableVolumeInfo.setText(this.MediaSessionCompatQueueItem);
        if (this.PlaybackStateCompat == 0) {
            return;
        }
        this.RatingCompat.post(new zza(26, this));
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.PlaybackStateCompat = bundle.getInt("scroll_pos");
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
