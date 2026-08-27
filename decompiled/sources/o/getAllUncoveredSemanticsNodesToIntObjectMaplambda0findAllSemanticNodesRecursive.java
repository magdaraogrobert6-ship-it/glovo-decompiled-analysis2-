package o;

import bo.app.af$$ExternalSyntheticOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.huawei.location.nlp.network.request.wifi.WifiExtraInfo;
import io.sentry.SentryUUID;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes5.dex */
public final class getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive implements ShadowContext {
    private static int serializer = 0;
    private static int write = 1;
    public final createOuterShadowBitmapD_oqF2M IconCompatParcelizer;
    public final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();
    public final ContextScope read;

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | (~(i7 | i4));
        int i9 = (~i3) | i6;
        int i10 = ~(i9 | i4);
        int i11 = (~(i3 | (~i4))) | (~i9);
        int i12 = i6 + i4 + i5 + (243328196 * i2) + (549715570 * i);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i6) + 1264254976 + ((-1099560353) * i4) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i5) + (781713408 * i2) + (665583616 * i) + (1005256704 * i13);
        int i15 = (i6 * 1467389705) + 421362043 + (i4 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i5 * 1467388771) + (i2 * (-1383267380)) + (i * 1030937622) + (i13 * 484507648);
        return i14 + ((i15 * i15) * 1164771328) != 1 ? read(objArr) : IconCompatParcelizer(objArr);
    }

    @Override // o.ShadowContext
    public final /* bridge */ void write(String str, String str2) {
        int i = 2 % 2;
        int i2 = write + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive(createOuterShadowBitmapD_oqF2M createoutershadowbitmapd_oqf2m, ContextScope contextScope) {
        this.IconCompatParcelizer = createoutershadowbitmapd_oqf2m;
        this.read = contextScope;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r4
  0x002d: PHI (r4v3 o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) = 
  (r4v2 o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode)
  (r4v9 o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode)
 binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer(String str, String str2, String str3) {
        getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode;
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
            getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.get(str);
            int i3 = 91 / 0;
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode != null) {
                getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.serializer(str2, str3);
            }
        } else {
            af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
            getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.get(str);
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode != null) {
                getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.serializer(str2, str3);
            }
        }
        int i4 = write + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DropShadowRenderer
    public final void write(String str) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            SentryUUID.IconCompatParcelizer(this, this.IconCompatParcelizer, str);
            throw null;
        }
        str.getClass();
        if (!SentryUUID.IconCompatParcelizer(this, this.IconCompatParcelizer, str)) {
            int i3 = write + 21;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.remove(str);
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode != null) {
                getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.serializer();
            }
        }
    }

    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer(String str) {
        getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode;
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.remove(str);
            int i3 = 46 / 0;
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode == null) {
                return;
            }
        } else {
            str.getClass();
            getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.remove(str);
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode == null) {
                return;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.IconCompatParcelizer, null, null, new DiskLruCache$launchCleanup$1(getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode, null, 12), 3);
        int i4 = serializer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 % 4;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str.length() > 0) {
            if (str.length() == 0) {
                DrawableTransformation.write("Char sequence is empty.");
            } else if (Character.isLetterOrDigit(str.charAt(0))) {
                int i3 = serializer;
                int i4 = i3 + 53;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 13;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = serializer + 113;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    @Override // o.DropShadowRenderer
    public final void write(String str, String str2, long j, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        int i = 2 % 2;
        int i2 = write + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str2.getClass();
        androidShadowContext_androidKt.getClass();
        int i4 = WifiExtraInfo.read();
        int i5 = WifiExtraInfo.read();
        int i6 = WifiExtraInfo.read();
        if (((Boolean) read(WifiExtraInfo.read(), i6, i4, new Object[]{str2}, -1698363420, i5, 1698363421)).booleanValue()) {
            int i7 = write + 15;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i7 % 2 != 0) {
                throw null;
            }
            getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.get(str);
            if (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode != null) {
                int i8 = write + 17;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.serializer.write(str2, Long.valueOf(j), getColorValue.serializer(androidShadowContext_androidKt));
                } else {
                    getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.serializer.write(str2, Long.valueOf(j), getColorValue.serializer(androidShadowContext_androidKt));
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    @Override // o.DropShadowRenderer
    public final void serializer(long j, String str, String str2) {
        getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode;
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        if (!(!((Boolean) read(WifiExtraInfo.read(), WifiExtraInfo.read(), WifiExtraInfo.read(), new Object[]{str2}, -1698363420, WifiExtraInfo.read(), 1698363421)).booleanValue()) && (getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer.get(str)) != null) {
            int i2 = serializer + 71;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.RemoteActionCompatParcelizer(str2, j);
        }
        int i4 = serializer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive getalluncoveredsemanticsnodestointobjectmaplambda0findallsemanticnodesrecursive = (getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        AndroidShadowContext_androidKt androidShadowContext_androidKt = (AndroidShadowContext_androidKt) objArr[5];
        int i = 2 % 2;
        int i2 = serializer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str2.getClass();
            androidShadowContext_androidKt.getClass();
            getalluncoveredsemanticsnodestointobjectmaplambda0findallsemanticnodesrecursive.write(str, str2, jLongValue, androidShadowContext_androidKt);
            int i3 = 93 / 0;
        } else {
            str2.getClass();
            androidShadowContext_androidKt.getClass();
            getalluncoveredsemanticsnodestointobjectmaplambda0findallsemanticnodesrecursive.write(str, str2, jLongValue, androidShadowContext_androidKt);
        }
        int i4 = write + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        Collection<getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        int i4 = write + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 3 / 2;
        }
        for (getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode : collectionValues) {
            BuildersKt.RemoteActionCompatParcelizer(getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode.IconCompatParcelizer, null, null, new DiskLruCache$launchCleanup$1(getalluncoveredsemanticsnodestointobjectmaplambda0addfakenode, null, 12), 3);
        }
        concurrentHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // o.DropShadowRenderer
    public final void serializer(String str) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            str.getClass();
            int i5 = 53 / 0;
            if (SentryUUID.IconCompatParcelizer(this, this.IconCompatParcelizer, str)) {
                int i6 = write + 17;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i = WifiExtraInfo.read();
                i2 = WifiExtraInfo.read();
                if (((Boolean) read(WifiExtraInfo.read(), WifiExtraInfo.read(), i, new Object[]{str}, -1698363420, i2, 1698363421)).booleanValue()) {
                    handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
                    handlecardclicklambda4.serializer = r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.ON;
                    AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer();
                    addToCustomAttributeArrayStepIconCompatParcelizer.getClass();
                    getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = addToCustomAttributeArrayStepIconCompatParcelizer.serializer(new defaultCardHandling(str, "operation.performance"), handlecardclicklambda4);
                    getchildstepiteratorandroid_sdk_ui_releaseSerializer.getClass();
                    this.RemoteActionCompatParcelizer.put(str, new getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode(getchildstepiteratorandroid_sdk_ui_releaseSerializer, this.read));
                }
            }
        } else {
            str.getClass();
            if (!(!SentryUUID.IconCompatParcelizer(this, this.IconCompatParcelizer, str))) {
                int i8 = write + 17;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i = WifiExtraInfo.read();
                i2 = WifiExtraInfo.read();
                if (((Boolean) read(WifiExtraInfo.read(), WifiExtraInfo.read(), i, new Object[]{str}, -1698363420, i2, 1698363421)).booleanValue()) {
                    handleCardClicklambda4 handlecardclicklambda5 = new handleCardClicklambda4();
                    handlecardclicklambda5.serializer = r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.ON;
                    AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer2 = internalHeightCallbacklambda0.IconCompatParcelizer();
                    addToCustomAttributeArrayStepIconCompatParcelizer2.getClass();
                    getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer2 = addToCustomAttributeArrayStepIconCompatParcelizer2.serializer(new defaultCardHandling(str, "operation.performance"), handlecardclicklambda5);
                    getchildstepiteratorandroid_sdk_ui_releaseSerializer2.getClass();
                    this.RemoteActionCompatParcelizer.put(str, new getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode(getchildstepiteratorandroid_sdk_ui_releaseSerializer2, this.read));
                }
            }
        }
        int i10 = serializer + 91;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
    }

    @Override // o.ShadowContext
    public final void serializer(String str, String str2, long j, Map map, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        Object[] objArr = {this, str, str2, Long.valueOf(j), map, androidShadowContext_androidKt};
        int i = WifiExtraInfo.read();
        int i2 = WifiExtraInfo.read();
        read(WifiExtraInfo.read(), WifiExtraInfo.read(), i, objArr, -719871848, i2, 719871848);
    }

    public static boolean read(String str) {
        int i = WifiExtraInfo.read();
        int i2 = WifiExtraInfo.read();
        int i3 = WifiExtraInfo.read();
        return ((Boolean) read(WifiExtraInfo.read(), i3, i, new Object[]{str}, -1698363420, i2, 1698363421)).booleanValue();
    }
}
