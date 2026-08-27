package o;

import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        boolean z = true;
        switch (i3) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) entry.getValue();
                StringBuilder sb = new StringBuilder();
                prepareInAppMessageWithBitmapDownloadlambda5.IconCompatParcelizer(str, sb);
                sb.append(':');
                sb.append(swipeDismissTouchListenerVerticalDismissDirection);
                return sb.toString();
            case 1:
                ((String) obj).getClass();
                return createfromparcel2;
            case 2:
                if (obj == null) {
                    int i4 = IconCompatParcelizer + 71;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj;
                CoroutineDispatcher coroutineDispatcher = !(shortNewsContentCardViewViewHolder instanceof CoroutineDispatcher) ? null : (CoroutineDispatcher) shortNewsContentCardViewViewHolder;
                int i6 = IconCompatParcelizer + 69;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return coroutineDispatcher;
                }
                obj2.hashCode();
                throw null;
            case 4:
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) obj;
                if (!(shortNewsContentCardViewViewHolder2 instanceof ExecutorCoroutineDispatcher)) {
                    return null;
                }
                int i7 = read + 45;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return (ExecutorCoroutineDispatcher) shortNewsContentCardViewViewHolder2;
                }
                throw null;
            case 5:
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = (getUnregisteredInAppMessageannotations) obj;
                getunregisteredinappmessageannotations.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations);
                if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
                    return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
                }
                if (Options.Companion.read(getunregisteredinappmessageannotations).isInterface()) {
                    return new resetLayoutParamsIfAppropriate(getunregisteredinappmessageannotations);
                }
                return null;
            case 6:
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2 = (getUnregisteredInAppMessageannotations) obj;
                getunregisteredinappmessageannotations2.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations2);
                if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 == null) {
                    setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 = Options.Companion.read(getunregisteredinappmessageannotations2).isInterface() ? new resetLayoutParamsIfAppropriate(getunregisteredinappmessageannotations2) : null;
                }
                if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 != null) {
                    return LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2);
                }
                return null;
            default:
                r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
                r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc.write("JsonPrimitive", new r8lambda0k9Ykqi4k5VoqUtXTbtitVtyRA(new performPushDeliveryFlushlambda1(10)));
                r8lambdaxtprrz59iioouochp937ds3kubc.write("JsonNull", new r8lambda0k9Ykqi4k5VoqUtXTbtitVtyRA(new performPushDeliveryFlushlambda1(11)));
                r8lambdaxtprrz59iioouochp937ds3kubc.write("JsonLiteral", new r8lambda0k9Ykqi4k5VoqUtXTbtitVtyRA(new performPushDeliveryFlushlambda1(12)));
                r8lambdaxtprrz59iioouochp937ds3kubc.write("JsonObject", new r8lambda0k9Ykqi4k5VoqUtXTbtitVtyRA(new performPushDeliveryFlushlambda1(13)));
                r8lambdaxtprrz59iioouochp937ds3kubc.write("JsonArray", new r8lambda0k9Ykqi4k5VoqUtXTbtitVtyRA(new performPushDeliveryFlushlambda1(14)));
                return createfromparcel2;
        }
    }
}
