package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getIndexOfFirstFeature extends ContextWrapper {
    public static Configuration read;
    public Configuration IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public LayoutInflater RemoteActionCompatParcelizer;
    public Resources serializer;
    public Resources.Theme write;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.RemoteActionCompatParcelizer;
    }

    public getIndexOfFirstFeature(Context context, int i) {
        super(context);
        this.MediaDescriptionCompat = i;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.write == null) {
            this.write = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.write.setTo(theme);
            }
        }
        this.write.applyStyle(this.MediaDescriptionCompat, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.serializer == null) {
            Configuration configuration = this.IconCompatParcelizer;
            if (configuration == null) {
                this.serializer = super.getResources();
            } else {
                if (read == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    read = configuration2;
                }
                if (configuration.equals(read)) {
                    this.serializer = super.getResources();
                } else {
                    this.serializer = createConfigurationContext(this.IconCompatParcelizer).getResources();
                }
            }
        }
        return this.serializer;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            RemoteActionCompatParcelizer();
        }
    }

    public final void write(Configuration configuration) {
        if (this.serializer != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("getResources() or getAssets() has already been called");
        } else if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new Configuration(configuration);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.write;
        if (theme != null) {
            return theme;
        }
        if (this.MediaDescriptionCompat == 0) {
            this.MediaDescriptionCompat = com.logistics.rider.glovo.R.style.Theme_AppCompat_Light;
        }
        RemoteActionCompatParcelizer();
        return this.write;
    }

    public getIndexOfFirstFeature(Context context) {
        super(context);
    }
}
