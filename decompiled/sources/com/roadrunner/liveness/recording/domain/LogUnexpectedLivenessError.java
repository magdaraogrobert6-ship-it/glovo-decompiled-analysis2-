package com.roadrunner.liveness.recording.domain;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.tasks.OnSuccessListener;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import o.onDowngrade;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogUnexpectedLivenessError implements OnSuccessListener {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Object write;

    public LogUnexpectedLivenessError(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.write = transfersessionpackagei;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = read + 37;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((onDowngrade) this.write).invoke(obj);
        int i4 = read + 13;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public LogUnexpectedLivenessError(onDowngrade ondowngrade) {
        this.write = ondowngrade;
    }

    public LogUnexpectedLivenessError(ChallengesRepository challengesRepository) {
        challengesRepository.getClass();
        this.write = challengesRepository;
    }

    public void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        ChallengesRepository challengesRepository = (ChallengesRepository) this.write;
        forest.write(new UnexpectedLivenessException(str + ". Challenge count: " + challengesRepository.serializer.size() + " Active Challenge Index: " + challengesRepository.IconCompatParcelizer.get(), null));
        int i2 = IconCompatParcelizer + 69;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
