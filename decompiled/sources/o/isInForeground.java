package o;

import com.roadrunner.rider.recruitment.applicant.domain.ShouldNavigateToRecruitmentScreenImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isInForeground extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ ShouldNavigateToRecruitmentScreenImpl IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isInForeground(ShouldNavigateToRecruitmentScreenImpl shouldNavigateToRecruitmentScreenImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = shouldNavigateToRecruitmentScreenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.invoke(this);
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(this);
        int i3 = write + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return objInvoke;
    }
}
