package androidx.compose.foundation;

import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import io.sentry.util.MediaBrowserCompatMediaItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Button;
import o.ButtonKtButton21;
import o.CheckboxKt;
import o.ExperimentalComposeUiApi;
import o.ExperimentalMediaQueryApi;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getHighNSsRyOo;
import o.getSpanVerticalAligndo9XGg;
import o.launchSessionResponseTasksI;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.shouldProcessEventI;
import o.teardownEventMetadataS;
import o.trackAdRevenueI;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(teardownEventMetadataS teardowneventmetadatas, shouldProcessEventI shouldprocesseventi, launchSessionResponseTasksI launchsessionresponsetasksi, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 4;
        this.RemoteActionCompatParcelizer = teardowneventmetadatas;
        this.serializer = shouldprocesseventi;
        this.write = launchsessionresponsetasksi;
        this.IconCompatParcelizer = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(ExperimentalComposeUiApi experimentalComposeUiApi, long j, getHighNSsRyOo gethighnssryoo, ExperimentalMediaQueryApi experimentalMediaQueryApi, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 2;
        this.RemoteActionCompatParcelizer = experimentalComposeUiApi;
        this.IconCompatParcelizer = j;
        this.serializer = gethighnssryoo;
        this.write = experimentalMediaQueryApi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(long j, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 3;
        this.serializer = platformSelectionBehaviorsImpl;
        this.write = charSequence;
        this.IconCompatParcelizer = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$handlePressInteractionRelease$1$1(Object obj, long j, MutableInteractionSourceImpl mutableInteractionSourceImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = j;
        this.write = mutableInteractionSourceImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return ((androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) create((o.getContentViewGroupParentLayout) r7, (o.ShortNewsContentCardView) r8)).invokeSuspend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return ((androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) create((android.view.textclassifier.TextClassifier) r7, (o.ShortNewsContentCardView) r8)).invokeSuspend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.MediaMetadataCompat
            int r1 = r1 + 27
            int r2 = r1 % 128
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.RatingCompat = r2
            int r1 = r1 % r0
            r2 = 3
            r3 = 1
            if (r1 != 0) goto L21
            int r1 = r6.read
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            r5 = 98
            int r5 = r5 / 0
            if (r1 == 0) goto L69
            if (r1 == r3) goto L5a
            if (r1 == r0) goto L4b
            if (r1 == r2) goto L3c
            goto L2d
        L21:
            int r1 = r6.read
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            if (r1 == 0) goto L69
            if (r1 == r3) goto L5a
            if (r1 == r0) goto L4b
            if (r1 == r2) goto L3c
        L2d:
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1 r7 = (androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L3c:
            android.view.textclassifier.TextClassifier r7 = (android.view.textclassifier.TextClassifier) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1 r7 = (androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L4b:
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1 r7 = (androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L5a:
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1 r7 = (androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L69:
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1 r7 = (androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            int r8 = androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.RatingCompat
            int r8 = r8 + 109
            int r1 = r8 % 128
            androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.MediaMetadataCompat = r1
            int r8 = r8 % r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        if (i2 == 0) {
            return new AbstractClickableNode$handlePressInteractionRelease$1$1((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) obj3, this.IconCompatParcelizer, (MutableInteractionSourceImpl) obj2, shortNewsContentCardView, 0);
        }
        if (i2 == 1) {
            AbstractClickableNode$handlePressInteractionRelease$1$1 abstractClickableNode$handlePressInteractionRelease$1$1 = new AbstractClickableNode$handlePressInteractionRelease$1$1((PopulateViewStructure_androidKtpopulate7) obj3, this.IconCompatParcelizer, (MutableInteractionSourceImpl) obj2, shortNewsContentCardView, 1);
            int i3 = RatingCompat + 3;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return abstractClickableNode$handlePressInteractionRelease$1$1;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return new AbstractClickableNode$handlePressInteractionRelease$1$1((teardownEventMetadataS) this.RemoteActionCompatParcelizer, (shouldProcessEventI) obj3, (launchSessionResponseTasksI) obj2, this.IconCompatParcelizer, shortNewsContentCardView);
            }
            AbstractClickableNode$handlePressInteractionRelease$1$1 abstractClickableNode$handlePressInteractionRelease$1$2 = new AbstractClickableNode$handlePressInteractionRelease$1$1(this.IconCompatParcelizer, (PlatformSelectionBehaviorsImpl) obj3, (CharSequence) obj2, shortNewsContentCardView);
            abstractClickableNode$handlePressInteractionRelease$1$2.RemoteActionCompatParcelizer = obj;
            return abstractClickableNode$handlePressInteractionRelease$1$2;
        }
        AbstractClickableNode$handlePressInteractionRelease$1$1 abstractClickableNode$handlePressInteractionRelease$1$3 = new AbstractClickableNode$handlePressInteractionRelease$1$1((ExperimentalComposeUiApi) this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, (getHighNSsRyOo) obj3, (ExperimentalMediaQueryApi) obj2, shortNewsContentCardView);
        int i5 = RatingCompat + 111;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return abstractClickableNode$handlePressInteractionRelease$1$3;
    }

    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0209  */
    /* JADX WARN: Code duplicated, block: B:88:0x020b A[PHI: r6
  0x020b: PHI (r6v7 o.Button) = (r6v5 o.Button), (r6v8 o.Button) binds: [B:77:0x01e4, B:87:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x021a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ButtonKtButton21 buttonKtButton21;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        Button button;
        int i;
        Button button2;
        int i2;
        String str;
        Object objM4919callgIAlus;
        int i3 = 2 % 2;
        int i4 = this.read;
        long j = this.IconCompatParcelizer;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        Object obj4 = createFromParcel.INSTANCE;
        if (i4 == 0) {
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.MediaBrowserCompatMediaItem;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.MediaBrowserCompatMediaItem = 1;
                if (((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) obj3).join(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                if (i5 != 2) {
                    if (i5 == 3) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj4;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                buttonKtButton21 = (ButtonKtButton21) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = 3;
            if (mutableInteractionSourceImpl.emit(buttonKtButton21, this) != coroutineSingletons) {
                return obj4;
            }
            return coroutineSingletons;
            Button button3 = new Button(j);
            ButtonKtButton21 buttonKtButton22 = new ButtonKtButton21(button3);
            this.RemoteActionCompatParcelizer = buttonKtButton22;
            this.MediaBrowserCompatMediaItem = 2;
            if (mutableInteractionSourceImpl.emit(button3, this) != coroutineSingletons) {
                buttonKtButton21 = buttonKtButton22;
                this.RemoteActionCompatParcelizer = null;
                this.MediaBrowserCompatMediaItem = 3;
                if (mutableInteractionSourceImpl.emit(buttonKtButton21, this) != coroutineSingletons) {
                    return obj4;
                }
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.MediaBrowserCompatMediaItem;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = ((ExperimentalComposeUiApi) this.RemoteActionCompatParcelizer).write;
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
                        Offset offsetM466boximpl = Offset.m466boximpl(j);
                        this.MediaBrowserCompatMediaItem = 1;
                        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(offsetM466boximpl, this) != coroutineSingletons2) {
                        }
                    }
                    return coroutineSingletons2;
                }
                int i7 = MediaMetadataCompat + 39;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i6 != 1) {
                    if (i6 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj4;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.MediaBrowserCompatMediaItem = 2;
                if (((getHighNSsRyOo) obj3).showTextContextMenu((ExperimentalMediaQueryApi) obj2, this) != coroutineSingletons2) {
                    return obj4;
                }
                return coroutineSingletons2;
            }
            if (i4 == 3) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.MediaBrowserCompatMediaItem;
                if (i9 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    TextClassifier textClassifier = (TextClassifier) this.RemoteActionCompatParcelizer;
                    this.MediaBrowserCompatMediaItem = 1;
                    return PlatformSelectionBehaviorsImpl.m110access$classifyTextM8tDOmk((PlatformSelectionBehaviorsImpl) obj3, (CharSequence) obj2, this.IconCompatParcelizer, textClassifier, this) == coroutineSingletons3 ? coroutineSingletons3 : obj4;
                }
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj4;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            teardownEventMetadataS teardowneventmetadatas = (teardownEventMetadataS) this.RemoteActionCompatParcelizer;
            shouldProcessEventI shouldprocesseventi = (shouldProcessEventI) obj3;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.MediaBrowserCompatMediaItem;
            try {
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (teardowneventmetadatas == null || (str = teardowneventmetadatas.RemoteActionCompatParcelizer) == null || str.length() == 0) {
                        return obj4;
                    }
                    shouldprocesseventi.write.IconCompatParcelizer(Boolean.TRUE);
                    FormBody.Builder builder = shouldprocesseventi.MediaSessionCompatQueueItem;
                    launchSessionResponseTasksI launchsessionresponsetasksi = (launchSessionResponseTasksI) obj2;
                    builder.getClass();
                    launchsessionresponsetasksi.getClass();
                    decode decodeVar = (decode) builder.serializer;
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("callType", launchsessionresponsetasksi.serializer.getValue());
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(launchsessionresponsetasksi.RemoteActionCompatParcelizer));
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("orderId", launchsessionresponsetasksi.IconCompatParcelizer);
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("screenName", "Recent Deliveries");
                    ((MediaBrowserCompatMediaItem) builder.RemoteActionCompatParcelizer).getClass();
                    decodeVar.logEvent("call_click", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, new onViewAttachedToWindowlambda0("isVoip", String.valueOf(false))));
                    UnifiedPhoneCallerImpl unifiedPhoneCallerImpl = shouldprocesseventi.ParcelableVolumeInfo;
                    getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg = new getSpanVerticalAligndo9XGg(this.IconCompatParcelizer, teardowneventmetadatas.RemoteActionCompatParcelizer, teardowneventmetadatas.IconCompatParcelizer, teardowneventmetadatas.serializer, teardowneventmetadatas.RatingCompat, teardowneventmetadatas.write, teardowneventmetadatas.read);
                    this.MediaBrowserCompatMediaItem = 1;
                    objM4919callgIAlus = unifiedPhoneCallerImpl.m4919callgIAlus(getspanverticalaligndo9xgg, this);
                    if (objM4919callgIAlus == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = RatingCompat + 61;
                    MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM4919callgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
                    int i13 = RatingCompat + 37;
                    MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
                Throwable thSerializer = onItemDismiss.serializer(objM4919callgIAlus);
                if (thSerializer != null) {
                    shouldprocesseventi.MediaDescriptionCompat.serializer(new trackAdRevenueI(shouldprocesseventi.MediaBrowserCompatMediaItem.read(thSerializer)));
                }
                shouldprocesseventi.write.IconCompatParcelizer(Boolean.FALSE);
                return obj4;
            } catch (Throwable th) {
                shouldprocesseventi.write.IconCompatParcelizer(Boolean.FALSE);
                throw th;
            }
        }
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) obj2;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj3;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = this.MediaBrowserCompatMediaItem;
        if (i15 != 0) {
            if (i15 == 1) {
                populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else if (i15 == 2) {
                int i16 = RatingCompat + 55;
                MediaMetadataCompat = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                button2 = (Button) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                button = button2;
                populateViewStructure_androidKtpopulate8.setValue(button);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj4 = null;
            }
            i2 = RatingCompat + 43;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return obj4;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Button button4 = (Button) populateViewStructure_androidKtpopulate8.getValue();
        if (button4 == null) {
            button = new Button(j);
            if (mutableInteractionSourceImpl2 != null) {
                i = MediaMetadataCompat + 29;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    this.RemoteActionCompatParcelizer = button;
                    this.MediaBrowserCompatMediaItem = 3;
                    if (mutableInteractionSourceImpl2.emit(button, this) != coroutineSingletons5) {
                        button2 = button;
                        button = button2;
                    }
                } else {
                    this.RemoteActionCompatParcelizer = button;
                    this.MediaBrowserCompatMediaItem = 2;
                    if (mutableInteractionSourceImpl2.emit(button, this) != coroutineSingletons5) {
                        button2 = button;
                        button = button2;
                    }
                }
                populateViewStructure_androidKtpopulate8.setValue(button);
            } else {
                populateViewStructure_androidKtpopulate8.setValue(button);
            }
            i2 = RatingCompat + 43;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return obj4;
            }
            throw null;
        }
        CheckboxKt checkboxKt = new CheckboxKt(button4);
        if (mutableInteractionSourceImpl2 != null) {
            this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate8;
            this.MediaBrowserCompatMediaItem = 1;
            if (mutableInteractionSourceImpl2.emit(checkboxKt, this) == coroutineSingletons5) {
            }
            i2 = RatingCompat + 43;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return obj4;
            }
            throw null;
        }
        populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
        obj4 = coroutineSingletons5;
        i2 = RatingCompat + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return obj4;
        }
        throw null;
        populateViewStructure_androidKtpopulate7.setValue(null);
        button = new Button(j);
        if (mutableInteractionSourceImpl2 != null) {
            i = MediaMetadataCompat + 29;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                this.RemoteActionCompatParcelizer = button;
                this.MediaBrowserCompatMediaItem = 3;
                if (mutableInteractionSourceImpl2.emit(button, this) != coroutineSingletons5) {
                    obj4 = coroutineSingletons5;
                } else {
                    button2 = button;
                    button = button2;
                }
            } else {
                this.RemoteActionCompatParcelizer = button;
                this.MediaBrowserCompatMediaItem = 2;
                if (mutableInteractionSourceImpl2.emit(button, this) != coroutineSingletons5) {
                    obj4 = coroutineSingletons5;
                } else {
                    button2 = button;
                    button = button2;
                }
            }
            populateViewStructure_androidKtpopulate8.setValue(button);
        } else {
            populateViewStructure_androidKtpopulate8.setValue(button);
        }
        i2 = RatingCompat + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return obj4;
        }
        throw null;
    }
}
