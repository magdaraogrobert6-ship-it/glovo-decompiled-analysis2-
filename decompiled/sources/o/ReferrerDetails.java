package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferrerDetails {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final List RemoteActionCompatParcelizer;
    public final markAsRead read;
    public final PopulateViewStructure_androidKtpopulate7 serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:2: B:45:0x0127->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:3: B:15:0x0042->B:74:?, LOOP_END, SYNTHETIC] */
    public ReferrerDetails(List list, String str, String str2) {
        Iterator it;
        Object next;
        list.getClass();
        this.RemoteActionCompatParcelizer = list;
        Object obj = null;
        if (list.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("DualColumnTimePicker requires at least one start option");
            throw null;
        }
        List list2 = list;
        if (list2 instanceof Collection) {
            int i = MediaDescriptionCompat + 93;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 13 / 0;
                if (!list2.isEmpty()) {
                    it = list2.iterator();
                    int i3 = 2 % 2;
                    while (!(!it.hasNext())) {
                        if (((markAsRead) it.next()).write.isEmpty()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Every start option must have at least one end option");
                            throw null;
                        }
                    }
                }
            } else if (!list2.isEmpty()) {
                it = list2.iterator();
                int i4 = 2 % 2;
                while (!(!it.hasNext())) {
                    if (((markAsRead) it.next()).write.isEmpty()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Every start option must have at least one end option");
                        throw null;
                    }
                }
            }
        } else {
            it = list2.iterator();
            int i5 = 2 % 2;
            while (!(!it.hasNext())) {
                if (((markAsRead) it.next()).write.isEmpty()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Every start option must have at least one end option");
                    throw null;
                }
            }
        }
        Iterator it2 = this.RemoteActionCompatParcelizer.iterator();
        do {
            if (!it2.hasNext()) {
                int i6 = IconCompatParcelizer + 5;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                } else {
                    int i8 = 2 % 2;
                }
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) next).serializer.read, str}, getCieXyz.write())).booleanValue());
        markAsRead markasread = (markAsRead) next;
        if (markasread == null) {
            int i9 = IconCompatParcelizer + 61;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            markasread = (markAsRead) onContentCardDismissed.read(this.RemoteActionCompatParcelizer);
        }
        this.read = markasread;
        this.serializer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(markasread.serializer.read);
        if (str2 != null) {
            int i11 = MediaDescriptionCompat + 109;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ArrayList arrayList = markasread.write;
            if (arrayList.isEmpty()) {
                int i13 = MediaDescriptionCompat + 77;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                int i15 = 2 % 2;
                str2 = null;
                break;
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    int i16 = MediaDescriptionCompat + 77;
                    IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    int i18 = 2 % 2;
                    str2 = null;
                    break;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it3.next()).IconCompatParcelizer.read, str2}, getCieXyz.write())).booleanValue()) {
                    int i19 = 2 % 2;
                    break;
                }
            }
            if (str2 == null) {
                markAsRead markasread2 = this.read;
                markasread2.getClass();
                ArrayList arrayList2 = markasread2.write;
                for (Object obj2 : arrayList2) {
                    if (((readContentProvider) obj2).read) {
                        obj = obj2;
                        break;
                    }
                }
                readContentProvider readcontentprovider = (readContentProvider) obj;
                str2 = (readcontentprovider == null ? (readContentProvider) onContentCardDismissed.read((List) arrayList2) : readcontentprovider).IconCompatParcelizer.read;
            }
        } else {
            markAsRead markasread3 = this.read;
            markasread3.getClass();
            ArrayList arrayList3 = markasread3.write;
            while (r13.hasNext()) {
                if (((readContentProvider) obj2).read) {
                    obj = obj2;
                    break;
                }
            }
            readContentProvider readcontentprovider2 = (readContentProvider) obj;
            str2 = (readcontentprovider2 == null ? (readContentProvider) onContentCardDismissed.read((List) arrayList3) : readcontentprovider2).IconCompatParcelizer.read;
        }
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(str2);
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (String) this.serializer.getValue();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final markAsRead write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (markAsRead markasread : this.RemoteActionCompatParcelizer) {
            Object[] objArr = {markasread.serializer.read, IconCompatParcelizer()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = IconCompatParcelizer + 51;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return markasread;
                }
                throw null;
            }
        }
        DrawableTransformation.write("Collection contains no element matching the predicate.");
        return null;
    }
}
