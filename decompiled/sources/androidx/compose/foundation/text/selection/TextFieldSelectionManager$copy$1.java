package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TextRangeKt;
import o.createFromParcel;
import o.getAnyOverlap;
import o.getContentViewGroupParentLayout;
import o.getPlatformAndroidManager;
import o.getProcessName;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(boolean z, int i, getPlatformAndroidManager getplatformandroidmanager, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 5;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = getplatformandroidmanager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager$copy$1(Object obj, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(boolean z, getProcessName getprocessname, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 7;
        this.IconCompatParcelizer = z;
        this.serializer = getprocessname;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 123;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        Object obj2 = this.serializer;
        boolean z = this.IconCompatParcelizer;
        Object obj3 = null;
        switch (i5) {
            case 0:
                TextFieldSelectionManager$copy$1 textFieldSelectionManager$copy$1 = new TextFieldSelectionManager$copy$1((TextFieldSelectionManager) obj2, z, shortNewsContentCardView, 0);
                int i6 = write + 57;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return textFieldSelectionManager$copy$1;
                }
                throw null;
            case 1:
                return new TextFieldSelectionManager$copy$1((DeliveryAcceptButtonUiModelImpl) obj2, z, shortNewsContentCardView, 1);
            case 2:
                return new TextFieldSelectionManager$copy$1((getAnyOverlap) obj2, z, shortNewsContentCardView, i);
            case 3:
                return new TextFieldSelectionManager$copy$1((TextRangeKt) obj2, z, shortNewsContentCardView, 3);
            case 4:
                return new TextFieldSelectionManager$copy$1((AcknowledgementTaskUiModelImpl) obj2, z, shortNewsContentCardView, 4);
            case 5:
                TextFieldSelectionManager$copy$1 textFieldSelectionManager$copy$2 = new TextFieldSelectionManager$copy$1(z, this.RemoteActionCompatParcelizer, (getPlatformAndroidManager) obj2, shortNewsContentCardView);
                int i7 = MediaSessionCompatQueueItem + 21;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return textFieldSelectionManager$copy$2;
            case 6:
                TextFieldSelectionManager$copy$1 textFieldSelectionManager$copy$3 = new TextFieldSelectionManager$copy$1((IncogniaManagerImpl) obj2, z, shortNewsContentCardView, 6);
                int i9 = MediaSessionCompatQueueItem + 27;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return textFieldSelectionManager$copy$3;
                }
                obj3.hashCode();
                throw null;
            default:
                return new TextFieldSelectionManager$copy$1(z, (getProcessName) obj2, shortNewsContentCardView);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 27;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 3:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = MediaSessionCompatQueueItem + 9;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel2;
            case 6:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((TextFieldSelectionManager$copy$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        if (r5.invoke(r6, r8, r9, r10, r12) == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
