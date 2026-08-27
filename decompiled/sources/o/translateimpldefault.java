package o;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class translateimpldefault implements scaleimpl {
    public final androidx.room.RoomDatabase IconCompatParcelizer;
    public final isIdentity58bKbWc write;

    public translateimpldefault(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        workDatabase_Impl.getClass();
        this.IconCompatParcelizer = workDatabase_Impl;
        this.write = new isIdentity58bKbWc(5);
    }

    public final int RemoteActionCompatParcelizer(setTranslationX settranslationx, String str) {
        settranslationx.getClass();
        str.getClass();
        return ((Number) TuplesKt.write(this.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(settranslationx, 19, str))).intValue();
    }

    public final void read(tintxETnrds tintxetnrds, ImageKt imageKt) {
        Image image = (Image) imageKt.keySet();
        ImageKt imageKt2 = image.IconCompatParcelizer;
        if (imageKt2.isEmpty()) {
            return;
        }
        if (imageKt.MediaMetadataCompat > 999) {
            getWhite0d7_KjUannotations.read(imageKt, new dotp89u6pk(this, tintxetnrds, 0));
            return;
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        getTransparent0d7_KjUannotations.RemoteActionCompatParcelizer(imageKt2.MediaMetadataCompat, sbM);
        sbM.append(")");
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer(sbM.toString());
        Iterator it = image.iterator();
        int i = 1;
        while (true) {
            ScrollState scrollState = (ScrollState) it;
            if (!scrollState.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    throw th;
                }
            }
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(i, (String) scrollState.next());
            i++;
        }
        uncheckedColordefaultRemoteActionCompatParcelizer.getClass();
        int i2 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "work_spec_id");
        if (i2 == -1) {
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            return;
        }
        while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            List list = (List) imageKt.get(uncheckedColordefaultRemoteActionCompatParcelizer.read(i2));
            if (list != null) {
                byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer.write(0);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                list.add((accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, iRemoteActionCompatParcelizer, 2102996089));
            }
        }
        uncheckedColordefaultRemoteActionCompatParcelizer.close();
    }

    public final void write(tintxETnrds tintxetnrds, ImageKt imageKt) {
        Image image = (Image) imageKt.keySet();
        ImageKt imageKt2 = image.IconCompatParcelizer;
        if (imageKt2.isEmpty()) {
            return;
        }
        if (imageKt.MediaMetadataCompat > 999) {
            getWhite0d7_KjUannotations.read(imageKt, new dotp89u6pk(this, tintxetnrds, 1));
            return;
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        getTransparent0d7_KjUannotations.RemoteActionCompatParcelizer(imageKt2.MediaMetadataCompat, sbM);
        sbM.append(")");
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer(sbM.toString());
        Iterator it = image.iterator();
        int i = 1;
        while (true) {
            ScrollState scrollState = (ScrollState) it;
            if (!scrollState.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    throw th;
                }
            }
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(i, (String) scrollState.next());
            i++;
        }
        uncheckedColordefaultRemoteActionCompatParcelizer.getClass();
        int i2 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "work_spec_id");
        if (i2 == -1) {
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            return;
        }
        while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            List list = (List) imageKt.get(uncheckedColordefaultRemoteActionCompatParcelizer.read(i2));
            if (list != null) {
                list.add(uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
            }
        }
        uncheckedColordefaultRemoteActionCompatParcelizer.close();
    }

    public final void read(int i, String str) {
        str.getClass();
        TuplesKt.write(this.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MatrixCompanion(i, str));
    }

    public final void IconCompatParcelizer(int i, String str) {
        str.getClass();
        TuplesKt.write(this.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MatrixKt(str, i, 0));
    }

    public final void read(long j, String str) {
        str.getClass();
        TuplesKt.write(this.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Outline(1, j, str));
    }

    public final int write(long j, String str) {
        str.getClass();
        return ((Number) TuplesKt.write(this.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Outline(0, j, str))).intValue();
    }

    public final setFrom58bKbWc write(String str) {
        str.getClass();
        return (setFrom58bKbWc) TuplesKt.write(this.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str, 7));
    }

    public final setTranslationX serializer(String str) {
        str.getClass();
        return (setTranslationX) TuplesKt.write(this.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str, 10));
    }
}
