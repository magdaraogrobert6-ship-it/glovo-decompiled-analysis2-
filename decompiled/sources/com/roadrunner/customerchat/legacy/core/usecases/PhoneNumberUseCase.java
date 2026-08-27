package com.roadrunner.customerchat.legacy.core.usecases;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import o.fireOnUpdatedRect;
import o.getPivotOffsetF1C5BW0;
import o.linkedForEach;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.withRect;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneNumberUseCase {
    private static int RatingCompat = 1;
    private static int write;
    public final linkedForEach IconCompatParcelizer;
    public final withRect RemoteActionCompatParcelizer;
    public Disposable read;
    public final getPivotOffsetF1C5BW0 serializer;

    public PhoneNumberUseCase(linkedForEach linkedforeach, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, withRect withrect) {
        linkedforeach.getClass();
        getpivotoffsetf1c5bw0.getClass();
        withrect.getClass();
        this.IconCompatParcelizer = linkedforeach;
        this.serializer = getpivotoffsetf1c5bw0;
        this.RemoteActionCompatParcelizer = withrect;
    }

    public final void serializer(long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.IconCompatParcelizer(j, "customer");
            throw null;
        }
        Single<fireOnUpdatedRect> singleIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(j, "customer");
        Disposable disposable = this.read;
        if (disposable != null) {
            int i3 = write + 81;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            disposable.dispose();
        }
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) this.serializer;
        SingleSubscribeOn singleSubscribeOnWrite = singleIconCompatParcelizer.write(androidScheduleProvider.IconCompatParcelizer());
        androidScheduleProvider.getClass();
        this.read = new SingleUnsubscribeOn(new SingleObserveOn(singleSubscribeOnWrite, AndroidSchedulers.RemoteActionCompatParcelizer()), androidScheduleProvider.IconCompatParcelizer()).subscribe(new RetryWithDelay$$ExternalSyntheticLambda1(3, new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 6)), new RetryWithDelay$$ExternalSyntheticLambda1(4, new SessionDao_Impl$$ExternalSyntheticLambda1(this, 12, r8lambdaunavo3sxub_pc9xroryotnrlvsm2)));
        int i5 = write + 91;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
