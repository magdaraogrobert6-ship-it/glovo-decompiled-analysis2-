package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class unpackInt2 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;

    public unpackInt2(transferSessionPackageI transfersessionpackagei, int i) {
        switch (i) {
            case 2:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 3:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 4:
            case 5:
            case 8:
            case 11:
            default:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 6:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 7:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 9:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 10:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 12:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 13:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 14:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 15:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
            case 16:
                transfersessionpackagei.getClass();
                this.RemoteActionCompatParcelizer = transfersessionpackagei;
                break;
        }
    }

    public boolean IconCompatParcelizer(gf gfVar) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        gd gdVar = null;
        if (i2 % 2 == 0) {
            gfVar.getClass();
            boolean z = gfVar instanceof gd;
            gdVar.hashCode();
            throw null;
        }
        gfVar.getClass();
        gdVar = !((gfVar instanceof gd) ^ true) ? (gd) gfVar : null;
        if (gdVar == null) {
            return false;
        }
        int i3 = serializer + 113;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return gdVar.IconCompatParcelizer <= ((double) ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer.write("entrance_picture_button_expansion_threshold"));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1
  0x0041: PHI (r1v8 java.util.List) = (r1v7 java.util.List), (r1v18 java.util.List) binds: [B:9:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0029 A[PHI: r1 r3
  0x0029: PHI (r1v14 java.util.List) = (r1v7 java.util.List), (r1v18 java.util.List) binds: [B:9:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r3v7 int) = (r3v2 int), (r3v10 int) binds: [B:9:0x003f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public LinkedHashMap write() {
        List listRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 16;
        if (i2 % 2 == 0) {
            listRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 22));
            if (iRemoteActionCompatParcelizer < 46) {
                int i4 = IconCompatParcelizer + 57;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                i3 = iRemoteActionCompatParcelizer;
            }
        } else {
            listRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                int i6 = IconCompatParcelizer + 57;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                i3 = iRemoteActionCompatParcelizer;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
        for (Object obj : listRemoteActionCompatParcelizer) {
            linkedHashMap.put(obj, new java.util.Locale((String) obj).getDisplayLanguage());
        }
        int i8 = IconCompatParcelizer + 31;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return linkedHashMap;
    }

    public /* synthetic */ unpackInt2(transferSessionPackageI transfersessionpackagei, byte b, char c) {
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public unpackInt2(transferSessionPackageI transfersessionpackagei, AndroidUiFrameClock androidUiFrameClock) {
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }
}
