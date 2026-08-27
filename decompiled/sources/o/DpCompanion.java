package o;

import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DpCompanion extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public sourceInformationContextOf RemoteActionCompatParcelizer;
    public boolean read;
    public final /* synthetic */ CodeScanViewModel serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DpCompanion(CodeScanViewModel codeScanViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = codeScanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 101;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return CodeScanViewModel.access$handleCodeSuccess(this.serializer, null, null, this);
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 54 / 0;
        return CodeScanViewModel.access$handleCodeSuccess(this.serializer, null, null, this);
    }
}
