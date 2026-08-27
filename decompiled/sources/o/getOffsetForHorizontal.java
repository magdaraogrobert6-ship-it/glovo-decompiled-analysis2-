package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getOffsetForHorizontal {
    private static int read = 1;
    private static int serializer;

    public static drawTextOnPath read(getLineBreakStyle getlinebreakstyle) {
        List listSerializer;
        int i = 2 % 2;
        int i2 = read + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getDrawFilter getdrawfilter = null;
        if (getlinebreakstyle != null) {
            List listSerializer2 = getlinebreakstyle.serializer();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSerializer2) {
                if (obj instanceof getJustificationMode) {
                    int i4 = read + 109;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    arrayList.add(obj);
                    int i6 = read + 17;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
            getJustificationMode getjustificationmode = (getJustificationMode) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
            if (getjustificationmode != null) {
                List listSerializer3 = getlinebreakstyle.serializer();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listSerializer3) {
                    int i8 = serializer + 55;
                    read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (obj2 instanceof getTextDir) {
                        int i10 = serializer + 15;
                        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        arrayList2.add(obj2);
                    }
                }
                getTextDir gettextdir = (getTextDir) onContentCardDismissed.MediaMetadataCompat((List) arrayList2);
                if (gettextdir != null) {
                    List listSerializer4 = getlinebreakstyle.serializer();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listSerializer4) {
                        if (obj3 instanceof getRightIndents) {
                            arrayList3.add(obj3);
                        }
                    }
                    getRightIndents getrightindents = (getRightIndents) onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
                    if (getrightindents != null) {
                        List listSerializer5 = getlinebreakstyle.serializer();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listSerializer5) {
                            if (obj4 instanceof TextAlignmentAdapter) {
                                arrayList4.add(obj4);
                            }
                        }
                        TextAlignmentAdapter textAlignmentAdapter = (TextAlignmentAdapter) onContentCardDismissed.MediaMetadataCompat((List) arrayList4);
                        if (textAlignmentAdapter != null) {
                            List listSerializer6 = getlinebreakstyle.serializer();
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it = listSerializer6.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                int i12 = serializer + 1;
                                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                Object next = it.next();
                                if (next instanceof clipPath) {
                                    arrayList5.add(next);
                                }
                            }
                            clipPath clippath = (clipPath) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                            boolean z = getrightindents.IconCompatParcelizer() == null;
                            String strRemoteActionCompatParcelizer = getjustificationmode.RemoteActionCompatParcelizer();
                            String strIconCompatParcelizer = getjustificationmode.IconCompatParcelizer();
                            String str = textAlignmentAdapter.read();
                            String strWrite = textAlignmentAdapter.write();
                            String strSerializer = textAlignmentAdapter.serializer();
                            String strRemoteActionCompatParcelizer2 = textAlignmentAdapter.RemoteActionCompatParcelizer();
                            List listIconCompatParcelizer = textAlignmentAdapter.IconCompatParcelizer();
                            if (clippath != null) {
                                int i14 = serializer + 95;
                                read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                listSerializer = clippath.serializer();
                            } else {
                                listSerializer = null;
                            }
                            if (listSerializer == null) {
                                listSerializer = instance_delegatelambda0.write;
                            }
                            getMaximumBitmapHeight getmaximumbitmapheight = new getMaximumBitmapHeight(strRemoteActionCompatParcelizer, strIconCompatParcelizer, str, strWrite, strSerializer, strRemoteActionCompatParcelizer2, onContentCardDismissed.IconCompatParcelizer(listSerializer, listIconCompatParcelizer));
                            String strSerializer2 = gettextdir.serializer();
                            onActivityPreCreated onactivityprecreatedWrite = gettextdir.write();
                            if (onactivityprecreatedWrite != null) {
                                double dRemoteActionCompatParcelizer = onactivityprecreatedWrite.RemoteActionCompatParcelizer();
                                onActivityPreCreated onactivityprecreatedWrite2 = gettextdir.write();
                                if (onactivityprecreatedWrite2 != null) {
                                    getdrawfilter = new getDrawFilter(getrightindents.IconCompatParcelizer(), dRemoteActionCompatParcelizer, onactivityprecreatedWrite2.serializer());
                                }
                            }
                            return new drawTextOnPath(getmaximumbitmapheight, getdrawfilter, strSerializer2, true, z, getjustificationmode.IconCompatParcelizer(), getjustificationmode.write(), false, z, gettextdir.IconCompatParcelizer());
                        }
                    }
                }
            }
        }
        return null;
    }
}
