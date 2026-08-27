package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessandjd {
    public final List IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public List RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public List read;
    public final isAdapterPositionOnScreen serializer;
    public final isAdapterPositionOnScreen write;

    public accessandjd(List list, List list2, List list3, List list4, List list5) {
        this.IconCompatParcelizer = list;
        this.MediaDescriptionCompat = list2;
        this.RemoteActionCompatParcelizer = list3;
        this.RatingCompat = list4;
        this.read = list5;
        final int i = 0;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.accessminusjd
            public final /* synthetic */ accessandjd IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                accessandjd accessandjdVar = this.IconCompatParcelizer;
                int i3 = 0;
                if (i2 != 0) {
                    List list6 = accessandjdVar.read;
                    ArrayList arrayList = new ArrayList();
                    int size = list6.size();
                    while (i3 < size) {
                        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list6.get(i3)).invoke(), (Collection) arrayList);
                        i3++;
                    }
                    accessandjdVar.read = instance_delegatelambda0Var;
                    return arrayList;
                }
                List list7 = accessandjdVar.RatingCompat;
                ArrayList arrayList2 = new ArrayList();
                int size2 = list7.size();
                while (i3 < size2) {
                    onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list7.get(i3)).invoke(), (Collection) arrayList2);
                    i3++;
                }
                accessandjdVar.RatingCompat = instance_delegatelambda0Var;
                return arrayList2;
            }
        });
        final int i2 = 1;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.accessminusjd
            public final /* synthetic */ accessandjd IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                accessandjd accessandjdVar = this.IconCompatParcelizer;
                int i4 = 0;
                if (i3 != 0) {
                    List list6 = accessandjdVar.read;
                    ArrayList arrayList = new ArrayList();
                    int size = list6.size();
                    while (i4 < size) {
                        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list6.get(i4)).invoke(), (Collection) arrayList);
                        i4++;
                    }
                    accessandjdVar.read = instance_delegatelambda0Var;
                    return arrayList;
                }
                List list7 = accessandjdVar.RatingCompat;
                ArrayList arrayList2 = new ArrayList();
                int size2 = list7.size();
                while (i4 < size2) {
                    onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list7.get(i4)).invoke(), (Collection) arrayList2);
                    i4++;
                }
                accessandjdVar.RatingCompat = instance_delegatelambda0Var;
                return arrayList2;
            }
        });
    }
}
