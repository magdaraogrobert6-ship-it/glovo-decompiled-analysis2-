package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class register implements getResources, AdapterView.OnItemClickListener {
    public getDrawerToggleDelegate IconCompatParcelizer;
    public registerKey MediaMetadataCompat;
    public unregisteractivity RemoteActionCompatParcelizer;
    public Context read;
    public LayoutInflater serializer;
    public AlertControllerButtonHandler write;

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(Keep keep) {
        return false;
    }

    @Override // o.getResources
    public final void read(getDrawerToggleDelegate getdrawertoggledelegate) {
        this.IconCompatParcelizer = getdrawertoggledelegate;
    }

    @Override // o.getResources
    public final boolean read() {
        return false;
    }

    @Override // o.getResources
    public final boolean write(Keep keep) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.write.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.getItem(i), this, 0);
    }

    public register(ContextWrapper contextWrapper) {
        this.read = contextWrapper;
        this.serializer = LayoutInflater.from(contextWrapper);
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(Context context, AlertControllerButtonHandler alertControllerButtonHandler) {
        if (this.read != null) {
            this.read = context;
            if (this.serializer == null) {
                this.serializer = LayoutInflater.from(context);
            }
        }
        this.write = alertControllerButtonHandler;
        unregisteractivity unregisteractivityVar = this.RemoteActionCompatParcelizer;
        if (unregisteractivityVar != null) {
            unregisteractivityVar.notifyDataSetChanged();
        }
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        getDrawerToggleDelegate getdrawertoggledelegate = this.IconCompatParcelizer;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(alertControllerButtonHandler, z);
        }
    }

    @Override // o.getResources
    public final void MediaDescriptionCompat() {
        unregisteractivity unregisteractivityVar = this.RemoteActionCompatParcelizer;
        if (unregisteractivityVar != null) {
            unregisteractivityVar.notifyDataSetChanged();
        }
    }

    public final onCreateSupportNavigateUpTaskStack RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = (registerKey) this.serializer.inflate(com.logistics.rider.glovo.R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new unregisteractivity(this);
            }
            this.MediaMetadataCompat.setAdapter((ListAdapter) this.RemoteActionCompatParcelizer);
            this.MediaMetadataCompat.setOnItemClickListener(this);
        }
        return this.MediaMetadataCompat;
    }

    public final unregisteractivity IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new unregisteractivity(this);
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(onNightModeChanged onnightmodechanged) {
        if (!onnightmodechanged.hasVisibleItems()) {
            return false;
        }
        AppCompatActivity appCompatActivity = new AppCompatActivity();
        appCompatActivity.read = onnightmodechanged;
        DeltaDecoder deltaDecoder = new DeltaDecoder(onnightmodechanged.write);
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) deltaDecoder.serializer;
        register registerVar = new register(onretaincustomnonconfigurationinstance.write);
        appCompatActivity.RemoteActionCompatParcelizer = registerVar;
        registerVar.IconCompatParcelizer = appCompatActivity;
        onnightmodechanged.RemoteActionCompatParcelizer(registerVar);
        deltaDecoder.serializer(appCompatActivity.RemoteActionCompatParcelizer.IconCompatParcelizer(), appCompatActivity);
        View view = onnightmodechanged.MediaDescriptionCompat;
        if (view != null) {
            onretaincustomnonconfigurationinstance.RemoteActionCompatParcelizer = view;
        } else {
            onretaincustomnonconfigurationinstance.MediaMetadataCompat = onnightmodechanged.MediaBrowserCompatMediaItem;
            onretaincustomnonconfigurationinstance.ResultReceiver = onnightmodechanged.MediaMetadataCompat;
        }
        onretaincustomnonconfigurationinstance.MediaSessionCompatResultReceiverWrapper = appCompatActivity;
        removeOnContextAvailableListener removeoncontextavailablelistenerSerializer = deltaDecoder.serializer();
        appCompatActivity.write = removeoncontextavailablelistenerSerializer;
        removeoncontextavailablelistenerSerializer.setOnDismissListener(appCompatActivity);
        WindowManager.LayoutParams attributes = appCompatActivity.write.getWindow().getAttributes();
        attributes.type = com.adjust.sdk.network.ErrorCodes.MALFORMED_URL_EXCEPTION;
        attributes.flags |= androidx.compose.ui.graphics.Fields.RenderEffect;
        appCompatActivity.write.show();
        getDrawerToggleDelegate getdrawertoggledelegate = this.IconCompatParcelizer;
        if (getdrawertoggledelegate == null) {
            return true;
        }
        getdrawertoggledelegate.read(onnightmodechanged);
        return true;
    }
}
