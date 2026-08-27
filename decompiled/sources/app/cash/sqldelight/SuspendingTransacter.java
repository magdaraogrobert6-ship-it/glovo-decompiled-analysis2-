package app.cash.sqldelight;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public interface SuspendingTransacter extends TransacterBase {
    Object transaction(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);

    <R> Object transactionWithResult(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView);

    public static final class DefaultImpls {
        public static /* synthetic */ Object transaction$default(SuspendingTransacter suspendingTransacter, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return suspendingTransacter.transaction(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: transaction");
            return null;
        }

        public static /* synthetic */ Object transactionWithResult$default(SuspendingTransacter suspendingTransacter, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return suspendingTransacter.transactionWithResult(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: transactionWithResult");
            return null;
        }
    }
}
