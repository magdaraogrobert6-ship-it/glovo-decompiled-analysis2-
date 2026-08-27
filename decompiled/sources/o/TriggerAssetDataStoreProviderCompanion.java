package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TriggerAssetDataStoreProviderCompanion extends r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4<Float> {
    private final StringUtilsDataStoreProviderCompanion RemoteActionCompatParcelizer;

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Object IconCompatParcelizer(int i) {
        return new float[i];
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Class serializer() {
        return Float.class;
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final void write(Object obj, int i, Object obj2) {
        ((float[]) obj)[i] = ((Float) obj2).floatValue();
    }

    public TriggerAssetDataStoreProviderCompanion() {
        this.RemoteActionCompatParcelizer = new StringUtilsDataStoreProviderCompanion(this);
    }

    @SuppressLint
    public final float write(int i) {
        if (i < size()) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            return ((float[]) this.IconCompatParcelizer.get(iRemoteActionCompatParcelizer))[serializer(i)];
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Index ", size(), " is out of bounds. List size is "));
        return 0.0f;
    }

    public TriggerAssetDataStoreProviderCompanion(List<Float> list) {
        super(list);
        this.RemoteActionCompatParcelizer = new StringUtilsDataStoreProviderCompanion(this);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Float read(Object obj, int i) {
        return Float.valueOf(((float[]) obj)[i]);
    }

    public final void IconCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer.serializer(f);
    }

    public TriggerAssetDataStoreProviderCompanion(List<Float> list, int i) {
        super(list, i);
        this.RemoteActionCompatParcelizer = new StringUtilsDataStoreProviderCompanion(this);
    }

    public TriggerAssetDataStoreProviderCompanion(int i) {
        super(i);
        this.RemoteActionCompatParcelizer = new StringUtilsDataStoreProviderCompanion(this);
    }
}
