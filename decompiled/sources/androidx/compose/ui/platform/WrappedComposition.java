package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.ui.R;
import kotlin.jvm.internal.Lambda;
import o.AndroidColorSpace_androidKt;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationDate;
import o.getCreditCardExpirationMonth;
import o.getPassword;
import o.getPersonFirstName;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
final class WrappedComposition implements getCreditCardExpirationDate, toAndroidColorSpace, getPersonFirstName {
    private supportsColorMatrixQuery addedToLifecycle;
    private boolean disposed;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m2709getLambda$1759434350$ui();
    private final getCreditCardExpirationDate original;
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            super(1);
            this.$content = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        public final void invoke(final ComposeViewContext composeViewContext) {
            if (WrappedComposition.this.disposed) {
                return;
            }
            final supportsColorMatrixQuery lifecycle = composeViewContext.getLifecycleOwner$ui().getLifecycle();
            WrappedComposition.this.lastContent = this.$content;
            if (WrappedComposition.this.addedToLifecycle != null) {
                if (((accessregisterComponentCallback) lifecycle).RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
                    getCreditCardExpirationDate original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.$content;
                    original.setContent(new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull, int i) {
                            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                            if (getpostalcode.write(i & 1, (i & 3) != 2)) {
                                AndroidComposeView owner = wrappedComposition.getOwner();
                                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(wrappedComposition);
                                WrappedComposition wrappedComposition2 = wrappedComposition;
                                Object objComponentActivity = getpostalcode.ComponentActivity();
                                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                                    objComponentActivity = new WrappedComposition$setContent$1$2$1$1(wrappedComposition2, null);
                                    getpostalcode.write(objComponentActivity);
                                }
                                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, owner, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                                AndroidComposeView owner2 = wrappedComposition.getOwner();
                                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(wrappedComposition);
                                WrappedComposition wrappedComposition3 = wrappedComposition;
                                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                                    objComponentActivity2 = new WrappedComposition$setContent$1$2$2$1(wrappedComposition3, null);
                                    getpostalcode.write(objComponentActivity2);
                                }
                                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, owner2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
                                composeViewContext.ProvideCompositionLocals$ui(wrappedComposition.getOwner(), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, 0);
                                return;
                            }
                            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    }, true, -1723985096));
                    return;
                }
                return;
            }
            Object[] objArr = {Looper.myLooper(), composeViewContext.getView$ui().getHandler().getLooper()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                WrappedComposition.this.addedToLifecycle = lifecycle;
                lifecycle.IconCompatParcelizer(WrappedComposition.this);
            } else {
                View view$ui = composeViewContext.getView$ui();
                final WrappedComposition wrappedComposition2 = WrappedComposition.this;
                view$ui.post(new Runnable() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        WrappedComposition.AnonymousClass1.invoke$lambda$0(wrappedComposition2, lifecycle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WrappedComposition wrappedComposition, supportsColorMatrixQuery supportscolormatrixquery) {
            if (wrappedComposition.disposed) {
                return;
            }
            wrappedComposition.addedToLifecycle = supportscolormatrixquery;
            supportscolormatrixquery.IconCompatParcelizer(wrappedComposition);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ComposeViewContext) obj);
            return createFromParcel.INSTANCE;
        }
    }

    public final getCreditCardExpirationDate getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // o.getPersonFirstName
    public <T> T getCompositionService(getPassword getpassword) {
        getCreditCardExpirationDate getcreditcardexpirationdate = this.original;
        getPersonFirstName getpersonfirstname = getcreditcardexpirationdate instanceof getPersonFirstName ? (getPersonFirstName) getcreditcardexpirationdate : null;
        if (getpersonfirstname != null) {
            return (T) getpersonfirstname.getCompositionService(getpassword);
        }
        return null;
    }

    @Override // o.getCreditCardExpirationDate
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @Override // o.getCreditCardExpirationDate
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    public WrappedComposition(AndroidComposeView androidComposeView, getCreditCardExpirationDate getcreditcardexpirationdate) {
        this.owner = androidComposeView;
        this.original = getcreditcardexpirationdate;
    }

    @Override // o.toAndroidColorSpace
    public void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            dispose();
        } else {
            if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // o.getCreditCardExpirationDate
    public void setContent(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.owner.setOnReadyForComposition(new AnonymousClass1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0));
    }

    @Override // o.getCreditCardExpirationDate
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            supportsColorMatrixQuery supportscolormatrixquery = this.addedToLifecycle;
            if (supportscolormatrixquery != null) {
                supportscolormatrixquery.read(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.dispose();
    }
}
