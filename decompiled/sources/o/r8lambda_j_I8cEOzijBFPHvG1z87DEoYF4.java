package o;

import com.sentiance.sdk.crashloop.SdkInitGate$a$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda_j_I8cEOzijBFPHvG1z87DEoYF4 implements requestSingleLocationUpdateFromGooglePlaylambda10 {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ r8lambdacjWcjm3stVKeZF_SundXc95EHE8 read;

    public r8lambda_j_I8cEOzijBFPHvG1z87DEoYF4(r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8, long j) {
        this.read = r8lambdacjwcjm3stvkezf_sundxc95ehe8;
        this.IconCompatParcelizer = j;
    }

    @Override // o.requestSingleLocationUpdateFromGooglePlaylambda10
    public final void RemoteActionCompatParcelizer(setEmaillambda0 setemaillambda0) {
        setemaillambda0.getClass();
        r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8 = this.read;
        long j = this.IconCompatParcelizer;
        int i = 0;
        if (r8lambdacjwcjm3stvkezf_sundxc95ehe8.RemoteActionCompatParcelizer(j)) {
            r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatQueueItem.IconCompatParcelizer("Fetched new SDK config is up to date, no need to fetch again", new Object[0]);
        } else {
            r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatQueueItem.IconCompatParcelizer("Fetched SDK config is older than min modified time, retrying fetch after %d seconds", Long.valueOf(Long.valueOf(r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatToken).longValue() / 1000));
            r8lambdacjWcjm3stVKeZF_SundXc95EHE8.read(r8lambdacjwcjm3stvkezf_sundxc95ehe8, r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatToken, new SdkInitGate$a$$ExternalSyntheticLambda0(j, i, r8lambdacjwcjm3stvkezf_sundxc95ehe8));
        }
    }

    @Override // o.requestSingleLocationUpdateFromGooglePlaylambda10
    public final void serializer() {
        r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8 = this.read;
        r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatQueueItem.IconCompatParcelizer("Failed to fetch new SDK config, retrying fetch after %d millis", Long.valueOf(r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatToken));
        r8lambdacjWcjm3stVKeZF_SundXc95EHE8.read(r8lambdacjwcjm3stvkezf_sundxc95ehe8, r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatToken, new SdkInitGate$a$$ExternalSyntheticLambda0(this.IconCompatParcelizer, 1, r8lambdacjwcjm3stvkezf_sundxc95ehe8));
    }
}
