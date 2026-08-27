package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM extends r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4<Integer> {
    private final r8lambdawOtmeQOGveCe5nzBlMLTnZJEXQI RemoteActionCompatParcelizer;

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Class serializer() {
        return Integer.class;
    }

    public final void write(int i) {
        this.RemoteActionCompatParcelizer.read(i);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final void write(Object obj, int i, Object obj2) {
        ((int[]) obj)[i] = ((Integer) obj2).intValue();
    }

    private int MediaSessionCompatQueueItem(int i) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        return ((int[]) this.IconCompatParcelizer.get(iRemoteActionCompatParcelizer))[serializer(i)];
    }

    public r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM() {
        this.RemoteActionCompatParcelizer = new r8lambdawOtmeQOGveCe5nzBlMLTnZJEXQI(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM)) {
            return false;
        }
        r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM r8lambdaidq_hvsqzrowygs_o3rdceijnlm = (r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM) obj;
        if (size() != r8lambdaidq_hvsqzrowygs_o3rdceijnlm.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (MediaSessionCompatQueueItem(i) != r8lambdaidq_hvsqzrowygs_o3rdceijnlm.MediaSessionCompatQueueItem(i)) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint
    public final int read(int i) {
        if (i < size()) {
            return MediaSessionCompatQueueItem(i);
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Index ", size(), " is out of bounds. List size is "));
        return 0;
    }

    public final int read() {
        if (size() == 0) {
            return 0;
        }
        int iMediaSessionCompatQueueItem = 0;
        for (int i = 0; i < size(); i++) {
            iMediaSessionCompatQueueItem += MediaSessionCompatQueueItem(i);
        }
        return iMediaSessionCompatQueueItem / size();
    }

    public r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM(List<Integer> list) {
        super(list);
        this.RemoteActionCompatParcelizer = new r8lambdawOtmeQOGveCe5nzBlMLTnZJEXQI(this);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Integer read(Object obj, int i) {
        return Integer.valueOf(((int[]) obj)[i]);
    }

    public r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM(List<Integer> list, int i) {
        super(list, i);
        this.RemoteActionCompatParcelizer = new r8lambdawOtmeQOGveCe5nzBlMLTnZJEXQI(this);
    }

    public r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM(int i) {
        super(i);
        this.RemoteActionCompatParcelizer = new r8lambdawOtmeQOGveCe5nzBlMLTnZJEXQI(this);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Object IconCompatParcelizer(int i) {
        return new int[i];
    }
}
