package o;

import android.os.Parcel;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class onVisibilityChanged extends zzd implements OnVisibilityChangedNode {
    public onVisibilityChanged() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // o.OnVisibilityChangedNode
    public final void RemoteActionCompatParcelizer(String str, HashMap map) {
        OnVisibilityChangedModifierKt onVisibilityChangedModifierKt;
        HashMap map2 = OnSizeChangedModifier.read;
        if (map2.containsKey(str)) {
            onVisibilityChangedModifierKt = (OnVisibilityChangedModifierKt) map2.get(str);
        } else {
            onVisibilityChangedModifierKt = (OnVisibilityChangedModifierKt) OnSizeChangedModifier.serializer(OnVisibilityChangedModifierKt.class, str);
            map2.put(str, onVisibilityChangedModifierKt);
        }
        if (onVisibilityChangedModifierKt != null) {
            onVisibilityChangedModifierKt.execute(map);
        }
    }

    @Override // o.OnVisibilityChangedNode
    public final String read(String str, HashMap map) {
        HashMap map2 = OnSizeChangedModifier.RemoteActionCompatParcelizer;
        if (map2.containsKey(str)) {
            m1$$ExternalSyntheticOutline0.m(map2.get(str));
            return null;
        }
        m1$$ExternalSyntheticOutline0.m(OnSizeChangedModifier.serializer(OnVisibilityChangedElement.class, str));
        map2.put(str, null);
        return null;
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            HashMap mapSerializer = getDirectionCenterEK5gGoQ.serializer(parcel);
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            RemoteActionCompatParcelizer(string, mapSerializer);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        String string2 = parcel.readString();
        HashMap mapSerializer2 = getDirectionCenterEK5gGoQ.serializer(parcel);
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        read(string2, mapSerializer2);
        parcel2.writeNoException();
        parcel2.writeString(null);
        return true;
    }
}
