package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getCompositionStartui_text {
    private static int serializer = 1;
    private static int write;
    public final setTransactionSuccessful IconCompatParcelizer;
    public final Clock RemoteActionCompatParcelizer;

    public getCompositionStartui_text(setTransactionSuccessful settransactionsuccessful, Clock clock) {
        this.IconCompatParcelizer = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = clock;
    }

    public final getTopLeftnOccac write(boolean z, int i, Map map) {
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (z) {
            return null;
        }
        int i6 = i3 + 9;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i <= 1) {
            return null;
        }
        getOutline getoutlineWrite = write(false, true, map);
        if (!(getoutlineWrite instanceof getTopLeftnOccac)) {
            return null;
        }
        int i8 = serializer + 27;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return (getTopLeftnOccac) getoutlineWrite;
    }

    public static String IconCompatParcelizer(getMBufferStateui_text getmbufferstateui_text, int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (getmbufferstateui_text instanceof commitCompositionui_text) {
            int i3 = write + 35;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                ((commitCompositionui_text) getmbufferstateui_text).MediaSessionCompatQueueItem();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            commitCompositionui_text commitcompositionui_text = (commitCompositionui_text) getmbufferstateui_text;
            if (commitcompositionui_text.MediaSessionCompatQueueItem() != null) {
                sb.append(" • #");
                sb.append(commitcompositionui_text.MediaSessionCompatQueueItem());
                int i4 = write + 43;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        }
        if (i > 1) {
            sb.append(" • (1/" + i + ")");
        }
        return sb.toString();
    }

    public final getOutline write(boolean z, boolean z2, Map map) {
        Collection collectionValues;
        String strM;
        String strM2;
        String strIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (map != null && (collectionValues = map.values()) != null) {
            getMBufferStateui_text getmbufferstateui_text = (getMBufferStateui_text) onContentCardDismissed.read(z2 ? 1 : 0, onContentCardDismissed.serializer(collectionValues, new FocusChangedElement(2)));
            if (getmbufferstateui_text != null) {
                int size = map.size();
                List<setSelectionStart> listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(z ? 3 : 1, getmbufferstateui_text.RemoteActionCompatParcelizer());
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
                for (setSelectionStart setselectionstart : listIconCompatParcelizer) {
                    int i4 = serializer + 103;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    String strSerializer = setselectionstart.serializer();
                    long jWrite = setselectionstart.write();
                    long epochMilli = Instant.now(this.RemoteActionCompatParcelizer).toEpochMilli();
                    int i6 = ((int) (epochMilli - jWrite)) / 60000;
                    if (i6 < 0) {
                        Timber.RemoteActionCompatParcelizer.read(c8$$ExternalSyntheticOutline0.m(epochMilli, ")", c8$$ExternalSyntheticOutline0.m(jWrite, "messageReceivedTimestamp (", ") cannot be bigger than current time(")), new Object[0]);
                        strIconCompatParcelizer = null;
                    } else {
                        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
                        if (i6 == 0) {
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.actionable_customer_chat_timestamp_now);
                        } else {
                            strIconCompatParcelizer = String.format(java.util.Locale.getDefault(), "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i6), settransactionsuccessful.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.plurals.actionable_customer_chat_time_sent, i6)}, 2));
                        }
                    }
                    arrayList.add(new getImplui_graphics(strSerializer, strIconCompatParcelizer));
                }
                int size2 = getmbufferstateui_text.RemoteActionCompatParcelizer().size() - arrayList.size();
                if (getmbufferstateui_text instanceof commitCompositionui_text) {
                    commitCompositionui_text commitcompositionui_text = (commitCompositionui_text) getmbufferstateui_text;
                    String str = commitcompositionui_text.read();
                    String strSerializer2 = commitcompositionui_text.serializer();
                    String strIconCompatParcelizer2 = IconCompatParcelizer(getmbufferstateui_text, size);
                    if (size2 > 0) {
                        int i7 = write + 9;
                        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            c8$$ExternalSyntheticOutline0.m(size2, "+");
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        strM2 = c8$$ExternalSyntheticOutline0.m(size2, "+");
                    } else {
                        strM2 = null;
                    }
                    return new recordmLhObY(str, arrayList, strM2, write(z2, size, map), strIconCompatParcelizer2, strSerializer2, commitcompositionui_text.write());
                }
                if (getmbufferstateui_text instanceof deleteui_text) {
                    String str2 = ((deleteui_text) getmbufferstateui_text).read();
                    getTopLeftnOccac gettopleftnoccacWrite = write(z2, size, map);
                    String strIconCompatParcelizer3 = IconCompatParcelizer(getmbufferstateui_text, size);
                    if (size2 > 0) {
                        int i8 = serializer + 107;
                        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        strM = c8$$ExternalSyntheticOutline0.m(size2, "+");
                    } else {
                        strM = null;
                    }
                    return new setPivotOffsetk4lQ0M(str2, arrayList, strM, gettopleftnoccacWrite, strIconCompatParcelizer3);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        }
        return getOwnerViewId.IconCompatParcelizer;
    }
}
