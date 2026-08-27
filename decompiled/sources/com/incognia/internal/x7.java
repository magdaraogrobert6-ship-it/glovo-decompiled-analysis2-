package com.incognia.internal;

import android.content.Context;
import android.os.Environment;
import androidx.sqlite.SQLite;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.CaptionedImageContentCardView;
import o.ItemTouchHelperAdapter;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 {
    public static final List HQ = SQLite.read((String) W4i.Fv.MediaSessionCompatResultReceiverWrapper(), (String) W4i.vz.MediaSessionCompatResultReceiverWrapper(), (String) W4i.nIj.MediaSessionCompatResultReceiverWrapper(), (String) W4i.dtH.MediaSessionCompatResultReceiverWrapper(), (String) W4i.HO.MediaSessionCompatResultReceiverWrapper(), (String) W4i.kxk.MediaSessionCompatResultReceiverWrapper(), (String) W4i.uRZ.MediaSessionCompatResultReceiverWrapper(), (String) W4i.ErJ.MediaSessionCompatResultReceiverWrapper());
    public static final String N = (String) W4i.ODT.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;
    public final FW mbG;

    public final Set BGx() {
        Object isitemdismissable;
        String str;
        boolean zOptBoolean = ((JSONObject) this.BGx.BGx.get()).optBoolean((String) W4i.vo.MediaSessionCompatResultReceiverWrapper(), true);
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        if (!zOptBoolean) {
            return itemTouchHelperAdapter;
        }
        try {
            NvL nvL = this.BGx;
            String str2 = (String) W4i.Z.MediaSessionCompatResultReceiverWrapper();
            List list = HQ;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str2, list));
            if (((JSONObject) this.BGx.BGx.get()).optBoolean((String) W4i.E8z.MediaSessionCompatResultReceiverWrapper(), false)) {
                setParcelableVolumeInfo.addAll(list);
            }
            CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView();
            try {
                Context context = uF.BGx;
                if (context == null) {
                    throw new NullPointerException("Using SDK context before initialization");
                }
                String packageName = context.getPackageName();
                this.mbG.getClass();
                str = ((Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data") + '/' + packageName) + N;
                if (str != null) {
                    captionedImageContentCardView.add(new File(str, (String) W4i.Aj.MediaSessionCompatResultReceiverWrapper()).getAbsolutePath());
                    Iterator it = setParcelableVolumeInfo.iterator();
                    while (it.hasNext()) {
                        captionedImageContentCardView.add(new File(str, ((String) W4i.Aj.MediaSessionCompatResultReceiverWrapper()) + File.separator + ((String) it.next())).getAbsolutePath());
                    }
                }
                File fileRemoteActionCompatParcelizer = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.RemoteActionCompatParcelizer(Environment.getExternalStorageDirectory(), (String) W4i.Sm.MediaSessionCompatResultReceiverWrapper());
                captionedImageContentCardView.add(new File(fileRemoteActionCompatParcelizer, (String) W4i.Aj.MediaSessionCompatResultReceiverWrapper()).getAbsolutePath());
                Iterator it2 = setParcelableVolumeInfo.iterator();
                while (it2.hasNext()) {
                    captionedImageContentCardView.add(new File(fileRemoteActionCompatParcelizer, ((String) W4i.Aj.MediaSessionCompatResultReceiverWrapper()) + File.separator + ((String) it2.next())).getAbsolutePath());
                }
                isitemdismissable = RangesKt.IconCompatParcelizer(captionedImageContentCardView);
                Object obj = itemTouchHelperAdapter;
                if (!(isitemdismissable instanceof isItemDismissable)) {
                    obj = isitemdismissable;
                }
                return (Set) obj;
            } catch (Throwable unused) {
                str = null;
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
    }

    public x7(NvL nvL, FW fw) {
        this.BGx = nvL;
        this.mbG = fw;
    }
}
