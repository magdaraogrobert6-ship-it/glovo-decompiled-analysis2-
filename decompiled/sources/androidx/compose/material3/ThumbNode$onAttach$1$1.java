package androidx.compose.material3;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.H$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.AndroidFontListTypefaceCompanion;
import o.AndroidMultiParagraphDraw_androidKt;
import o.AndroidStringDelegate;
import o.AndroidTextPaint;
import o.AndroidViewBindingKtExternalSyntheticLambda7;
import o.AndroidViewBindinglambda00;
import o.AndroidViewBindinglambda600;
import o.C0199requestDisallowInterceptTouchEvent;
import o.ImeAction;
import o.OffsetMapping;
import o.OffsetMappingCompanionIdentity1;
import o.PartialGapBuffer;
import o.PartialGapBufferCompanion;
import o.PlaceholderExtensions_androidKt;
import o.ShortNewsContentCardView;
import o.SynchronizedObject;
import o.accessgetGocp;
import o.accessgetHasEmojiCompat;
import o.accessgetInstancedelegatecp;
import o.accessgetOwnerp;
import o.accessinsetToLayoutPosition;
import o.accesssetSizep;
import o.clearShader;
import o.createFromParcel;
import o.displayInAppMessage;
import o.fastCoerceAtMost;
import o.getBinding;
import o.getBrushSizeVsRJwc0ui_textannotations;
import o.getComposePaint;
import o.getIdentity;
import o.getLayoutParams;
import o.getOnDensityChangedui;
import o.getOnRequestDisallowInterceptTouchEventui;
import o.getSpanVerticalAligndo9XGgannotations;
import o.getUpdate;
import o.gf;
import o.insetValue;
import o.instance_delegatelambda0;
import o.invalidateOrDeferlambda0;
import o.isItemDismissable;
import o.n6;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onNestedPreScroll;
import o.onNestedScroll;
import o.onNestedScrollAccepted;
import o.onViewAttachedToWindowlambda0;
import o.originalToTransformed;
import o.previewHandwritingGesture;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8;
import o.r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.remeasure;
import o.removeNodeAtDepth;
import o.requestChildRectangleOnScreen;
import o.resolveTextDirectionHeuristicsHklW4sA;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.transformedToOriginal;
import o.unpackInt2;
import o.updateInputState;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNode$onAttach$1$1 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ ThumbNode$onAttach$1$1(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    private final Object emit$com$roadrunner$delivery$ontheway$observer$BuildingHighlightObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        SynchronizedObject synchronizedObject;
        int i = 2 % 2;
        int i2 = write + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(!(shortNewsContentCardView instanceof SynchronizedObject))) {
            synchronizedObject = (SynchronizedObject) shortNewsContentCardView;
            int i4 = synchronizedObject.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 107;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    synchronizedObject.write = i4 << Integer.MIN_VALUE;
                } else {
                    synchronizedObject.write = i4 - Integer.MIN_VALUE;
                }
            } else {
                synchronizedObject = new SynchronizedObject(this, shortNewsContentCardView);
            }
        } else {
            synchronizedObject = new SynchronizedObject(this, shortNewsContentCardView);
        }
        Object obj2 = synchronizedObject.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = synchronizedObject.write;
        if (i6 != 0) {
            int i7 = IconCompatParcelizer + 43;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            int i9 = write + 1;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0((Float) obj, (accessgetGocp) this.read);
            synchronizedObject.write = 1;
            if (flowCollector.emit(onviewattachedtowindowlambda0, synchronizedObject) == coroutineSingletons) {
                int i11 = IconCompatParcelizer + 117;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    private final Object emit$com$roadrunner$delivery$ontheway$entrancepicture$navigation$usecase$ObserveShouldShowImage$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        accessgetHasEmojiCompat accessgethasemojicompat;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof accessgetHasEmojiCompat) {
            accessgethasemojicompat = (accessgetHasEmojiCompat) shortNewsContentCardView;
            int i2 = accessgethasemojicompat.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accessgethasemojicompat.serializer = i2 - Integer.MIN_VALUE;
            } else {
                accessgethasemojicompat = new accessgetHasEmojiCompat(this, shortNewsContentCardView);
            }
        } else {
            accessgethasemojicompat = new accessgetHasEmojiCompat(this, shortNewsContentCardView);
        }
        Object obj2 = accessgethasemojicompat.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = accessgethasemojicompat.serializer;
        Object obj3 = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            boolean zIconCompatParcelizer = ((unpackInt2) ((m) this.read).read).IconCompatParcelizer((gf) obj);
            accessgethasemojicompat.serializer = 1;
            if (flowCollector.emit(Boolean.valueOf(zIconCompatParcelizer), accessgethasemojicompat) == coroutineSingletons) {
                int i4 = IconCompatParcelizer + 109;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = IconCompatParcelizer + 51;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            int i7 = write + 81;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    private final Object emit$com$roadrunner$delivery$ontheway$crowdsourcing$navigation$usecase$ObserveNavigationCrowdsourcing$observeGeofenceCrossed$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        updateInputState updateinputstate;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof updateInputState) {
            updateinputstate = (updateInputState) shortNewsContentCardView;
            int i2 = updateinputstate.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 125;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                updateinputstate.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i5 = write + 25;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                updateinputstate = new updateInputState(this, shortNewsContentCardView);
            }
        } else {
            updateinputstate = new updateInputState(this, shortNewsContentCardView);
        }
        Object obj2 = updateinputstate.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = updateinputstate.IconCompatParcelizer;
        if (i7 != 0) {
            int i8 = IconCompatParcelizer + 37;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i9 = write + 67;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            Float f = (Float) obj;
            boolean z = f != null && f.floatValue() <= ((float) ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) ((SignInDataStore) this.read).read)).IconCompatParcelizer.write("entrance_picture_button_expansion_threshold"));
            updateinputstate.IconCompatParcelizer = 1;
            if (flowCollector.emit(Boolean.valueOf(z), updateinputstate) == coroutineSingletons) {
                int i11 = write + 33;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r8.emit(r9, r1) == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$delivery$ontheway$crowdsourcing$floating$presentation$CrowdSourcingFloatingImageCameraOnlyUiModelImpl$observeUiState$$inlined$map$2$2(java.lang.Object r11, o.ShortNewsContentCardView r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ThumbNode$onAttach$1$1.emit$com$roadrunner$delivery$ontheway$crowdsourcing$floating$presentation$CrowdSourcingFloatingImageCameraOnlyUiModelImpl$observeUiState$$inlined$map$2$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private final Object emit$com$roadrunner$delivery$ontheway$entrancepicture$navigation$usecase$ObserveNavigationEntrancePicture$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        resolveTextDirectionHeuristicsHklW4sA resolvetextdirectionheuristicshklw4sa;
        accessinsetToLayoutPosition accessinsettolayoutposition;
        Object androidMultiParagraphDraw_androidKt;
        List list;
        List list2;
        Object next;
        List list3;
        Object next2;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof resolveTextDirectionHeuristicsHklW4sA) {
            resolvetextdirectionheuristicshklw4sa = (resolveTextDirectionHeuristicsHklW4sA) shortNewsContentCardView;
            int i2 = resolvetextdirectionheuristicshklw4sa.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = write + 125;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                resolvetextdirectionheuristicshklw4sa.serializer = i2 - Integer.MIN_VALUE;
            } else {
                resolvetextdirectionheuristicshklw4sa = new resolveTextDirectionHeuristicsHklW4sA(this, shortNewsContentCardView);
            }
        } else {
            resolvetextdirectionheuristicshklw4sa = new resolveTextDirectionHeuristicsHklW4sA(this, shortNewsContentCardView);
        }
        Object obj2 = resolvetextdirectionheuristicshklw4sa.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = resolvetextdirectionheuristicshklw4sa.serializer;
        accesssetSizep accesssetsizep = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) obj;
            if (androidViewBindinglambda00 == null || (list2 = androidViewBindinglambda00.components) == null) {
                accessinsettolayoutposition = null;
            } else {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        int i6 = write + 9;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        next = null;
                        break;
                    }
                    int i8 = IconCompatParcelizer + 109;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    next = it.next();
                } while (!(next instanceof accessgetOwnerp));
                accessgetOwnerp accessgetownerp = (accessgetOwnerp) next;
                if (accessgetownerp == null || (list3 = accessgetownerp.components) == null) {
                    accessinsettolayoutposition = null;
                } else {
                    Iterator it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        int i10 = IconCompatParcelizer + 123;
                        write = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        next2 = it2.next();
                    } while (!(next2 instanceof accessinsetToLayoutPosition));
                    accessinsettolayoutposition = (accessinsetToLayoutPosition) next2;
                }
            }
            if (accessinsettolayoutposition != null && (list = accessinsettolayoutposition.pictures) != null) {
                accesssetsizep = (accesssetSizep) onContentCardDismissed.MediaMetadataCompat(list);
            }
            if (accessinsettolayoutposition == null || accesssetsizep == null || !accessinsettolayoutposition.components.isEmpty()) {
                androidMultiParagraphDraw_androidKt = AndroidFontListTypefaceCompanion.IconCompatParcelizer;
            } else {
                SignInDataStore signInDataStore = (SignInDataStore) this.read;
                boolean zIconCompatParcelizer = ((unpackInt2) signInDataStore.read).IconCompatParcelizer((gf) ((n6) signInDataStore.RemoteActionCompatParcelizer).write.read());
                String str = accesssetsizep.url;
                int i12 = accessinsettolayoutposition.totalPictures;
                androidMultiParagraphDraw_androidKt = new AndroidMultiParagraphDraw_androidKt(str, i12, zIconCompatParcelizer, i12 > 1);
            }
            resolvetextdirectionheuristicshklw4sa.serializer = 1;
            if (flowCollector.emit(androidMultiParagraphDraw_androidKt, resolvetextdirectionheuristicshklw4sa) == coroutineSingletons) {
                int i13 = IconCompatParcelizer + 41;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = write + 91;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                accesssetsizep.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    private final Object emit$com$roadrunner$delivery$ontheway$header$implementation$domain$ObserveDestinationHeader$observeDestinationHeaderUiState$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        getBrushSizeVsRJwc0ui_textannotations getbrushsizevsrjwc0ui_textannotations;
        Object next;
        Object next2;
        Object next3;
        String str;
        Object next4;
        Object next5;
        Object next6;
        boolean z;
        int i = 2 % 2;
        if (!(!(shortNewsContentCardView instanceof getBrushSizeVsRJwc0ui_textannotations))) {
            getbrushsizevsrjwc0ui_textannotations = (getBrushSizeVsRJwc0ui_textannotations) shortNewsContentCardView;
            int i2 = getbrushsizevsrjwc0ui_textannotations.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 57;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getbrushsizevsrjwc0ui_textannotations.write = i2 - Integer.MIN_VALUE;
            } else {
                getbrushsizevsrjwc0ui_textannotations = new getBrushSizeVsRJwc0ui_textannotations(this, shortNewsContentCardView);
            }
        } else {
            getbrushsizevsrjwc0ui_textannotations = new getBrushSizeVsRJwc0ui_textannotations(this, shortNewsContentCardView);
        }
        Object obj2 = getbrushsizevsrjwc0ui_textannotations.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getbrushsizevsrjwc0ui_textannotations.write;
        Object obj3 = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (obj4 instanceof isItemDismissable) {
                obj4 = null;
            }
            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj4;
            Object androidStringDelegate = r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8.serializer;
            if (fastcoerceatmost != null) {
                List list = fastcoerceatmost.components;
                getComposePaint getcomposepaint = (getComposePaint) this.read;
                String str2 = "";
                if (getcomposepaint.write.IconCompatParcelizer()) {
                    H$b h$b = getcomposepaint.RemoteActionCompatParcelizer;
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it.next();
                    } while (!(next4 instanceof AndroidViewBindinglambda00));
                    AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) next4;
                    if (androidViewBindinglambda00 != null) {
                        int i6 = write + 27;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            List list2 = androidViewBindinglambda00.components;
                            throw null;
                        }
                        List list3 = androidViewBindinglambda00.components;
                        if (list3 != null) {
                            List list4 = list3;
                            Iterator it2 = list4.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                int i7 = IconCompatParcelizer + 37;
                                write = i7 % Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                next5 = it2.next();
                            } while (!(next5 instanceof accessgetOwnerp));
                            accessgetOwnerp accessgetownerp = (accessgetOwnerp) next5;
                            if (accessgetownerp == null) {
                                int i9 = IconCompatParcelizer + 75;
                                write = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 == 0) {
                                    int i10 = 19 / 0;
                                }
                            } else {
                                Iterator it3 = list4.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next6 = null;
                                        break;
                                    }
                                    int i11 = write + 55;
                                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                                    if (i11 % 2 != 0) {
                                        boolean z2 = it3.next() instanceof AndroidViewBindinglambda600;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    next6 = it3.next();
                                } while (!(next6 instanceof AndroidViewBindinglambda600));
                                AndroidViewBindinglambda600 androidViewBindinglambda600 = (AndroidViewBindinglambda600) next6;
                                String str3 = accessgetownerp.address;
                                String str4 = accessgetownerp.title;
                                String str5 = androidViewBindinglambda600 != null ? androidViewBindinglambda600.text : null;
                                r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite = accessgetownerp.write();
                                String str6 = r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite != null ? r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite.summary : null;
                                if (str5 != null) {
                                    int i12 = write + 121;
                                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                                    int i13 = i12 % 2;
                                    if (str5.length() == 0) {
                                        z = true;
                                    } else {
                                        int i14 = IconCompatParcelizer + 57;
                                        write = i14 % Fields.SpotShadowColor;
                                        if (i14 % 2 == 0) {
                                            int i15 = 2 % 3;
                                        }
                                        z = false;
                                    }
                                } else {
                                    z = true;
                                }
                                boolean z3 = str6 == null || str6.length() == 0;
                                if (!z && !z3) {
                                    str2 = ((setTransactionSuccessful) h$b.write).read(R.string.description_address_with_summary_format, str5, str6);
                                } else if (!z) {
                                    str2 = str5;
                                } else if (!z3) {
                                    str2 = str6;
                                }
                                String str7 = accessgetownerp.label;
                                str3.getClass();
                                displayInAppMessage displayinappmessage = new displayInAppMessage(str3);
                                String str8 = (String) (displayinappmessage.hasNext() ? displayinappmessage.next() : null);
                                if (str8 != null) {
                                    str3 = str8;
                                }
                                androidStringDelegate = new AndroidTextPaint(str4, str2, new ImeAction(str7, str3), ((PlaceholderExtensions_androidKt) h$b.serializer).IconCompatParcelizer(accessgetownerp));
                            }
                        }
                    }
                } else {
                    clearShader clearshader = getcomposepaint.IconCompatParcelizer;
                    Iterator it4 = list.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!(next instanceof AndroidViewBindinglambda00));
                    AndroidViewBindinglambda00 androidViewBindinglambda01 = (AndroidViewBindinglambda00) next;
                    List list5 = androidViewBindinglambda01 != null ? androidViewBindinglambda01.components : null;
                    if (list5 != null) {
                        List list6 = list5;
                        Iterator it5 = list6.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it5.next();
                        } while (!(next2 instanceof accessgetOwnerp));
                        accessgetOwnerp accessgetownerp2 = (accessgetOwnerp) next2;
                        if (accessgetownerp2 != null) {
                            Iterator it6 = list6.iterator();
                            do {
                                if (!it6.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                int i16 = IconCompatParcelizer + 31;
                                write = i16 % Fields.SpotShadowColor;
                                if (i16 % 2 == 0) {
                                    boolean z4 = it6.next() instanceof AndroidViewBindinglambda600;
                                    obj3.hashCode();
                                    throw null;
                                }
                                next3 = it6.next();
                            } while (!(next3 instanceof AndroidViewBindinglambda600));
                            AndroidViewBindinglambda600 androidViewBindinglambda601 = (AndroidViewBindinglambda600) next3;
                            String str9 = androidViewBindinglambda601 != null ? androidViewBindinglambda601.text : null;
                            String str10 = androidViewBindinglambda601 != null ? androidViewBindinglambda601.action : null;
                            r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite2 = accessgetownerp2.write();
                            String str11 = r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite2 != null ? r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite2.summary : null;
                            String str12 = str11 == null ? "" : str11;
                            boolean z5 = str12.length() > 0;
                            r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite3 = accessgetownerp2.write();
                            String str13 = r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite3 != null ? r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite3.reference : null;
                            String str14 = str13 == null ? "" : str13;
                            r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite4 = accessgetownerp2.write();
                            String str15 = r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite4 != null ? r8lambdaonkzdslej3y5sxq3mz_ny0yjnxeWrite4.shortCode : null;
                            if (str15 == null) {
                                int i17 = write + 39;
                                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                                if (i17 % 2 != 0) {
                                    int i18 = 3 / 0;
                                }
                                str = "";
                            } else {
                                str = str15;
                            }
                            boolean z6 = str14.length() > 0 || str.length() > 0;
                            getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotationsIconCompatParcelizer = clearshader.read.IconCompatParcelizer(accessgetownerp2);
                            if (str10 == null || str10.length() == 0) {
                                str10 = fastcoerceatmost.title;
                            }
                            String str16 = str10;
                            int i19 = write + 69;
                            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                            if (i19 % 2 != 0) {
                                String str17 = accessgetownerp2.title;
                                obj3.hashCode();
                                throw null;
                            }
                            String str18 = accessgetownerp2.title;
                            androidStringDelegate = new AndroidStringDelegate(str16, str18, str9 == null ? "" : str9, (str18.length() <= 0 || str9 == null || str9.length() == 0) ? false : true, getspanverticalaligndo9xggannotationsIconCompatParcelizer, str12, z5, str14, str, z6);
                        }
                    }
                }
            }
            getbrushsizevsrjwc0ui_textannotations.write = 1;
            if (flowCollector.emit(androidStringDelegate, getbrushsizevsrjwc0ui_textannotations) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01af  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:120:0x020f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0220  */
    /* JADX WARN: Code duplicated, block: B:128:0x0241  */
    /* JADX WARN: Code duplicated, block: B:131:0x024b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0276  */
    /* JADX WARN: Code duplicated, block: B:150:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x028a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0290  */
    /* JADX WARN: Code duplicated, block: B:155:0x0295  */
    /* JADX WARN: Code duplicated, block: B:157:0x0299  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:164:0x02af  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ea A[EDGE_INSN: B:176:0x02ea->B:177:0x02ec BREAK  A[LOOP:13: B:171:0x02cd->B:253:?]] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:181:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:193:0x0338  */
    /* JADX WARN: Code duplicated, block: B:195:0x033b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0348  */
    /* JADX WARN: Code duplicated, block: B:205:0x035c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0367  */
    /* JADX WARN: Code duplicated, block: B:208:0x0371  */
    /* JADX WARN: Code duplicated, block: B:218:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0164 A[EDGE_INSN: B:235:0x0164->B:89:0x0164 BREAK  A[LOOP:6: B:82:0x014f->B:87:0x0160], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x017f A[EDGE_INSN: B:237:0x017f->B:97:0x017f BREAK  A[LOOP:7: B:90:0x016a->B:95:0x017b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[LOOP:13: B:171:0x02cd->B:253:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[PHI: r5
  0x0072: PHI (r5v4 o.AndroidViewBindinglambda00) = (r5v3 o.AndroidViewBindinglambda00), (r5v11 o.AndroidViewBindinglambda00) binds: [B:25:0x0070, B:22:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160 A[LOOP:6: B:82:0x014f->B:87:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:95:0x017b A[LOOP:7: B:90:0x016a->B:95:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    private final Object emit$com$roadrunner$delivery$ontheway$crowdsourcing$gallery$domain$ObserveGalleryRemoteData$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        previewHandwritingGesture previewhandwritinggesture;
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons;
        int i;
        AndroidViewBindinglambda00 androidViewBindinglambda00;
        List list;
        List list2;
        Iterator it;
        Object next;
        accessgetOwnerp accessgetownerp;
        Iterator it2;
        Object next2;
        accessinsetToLayoutPosition accessinsettolayoutposition;
        List list3;
        Iterator it3;
        Object next3;
        onNestedPreScroll onnestedprescroll;
        ArrayList arrayList;
        Iterator it4;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
        Iterator it5;
        Object next4;
        AndroidViewBindingKtExternalSyntheticLambda7 androidViewBindingKtExternalSyntheticLambda7;
        getBinding getbinding;
        String str;
        String str2;
        String str3;
        boolean zRemoteActionCompatParcelizer;
        String str4;
        String str5;
        Iterator it6;
        boolean z;
        PartialGapBufferCompanion partialGapBufferCompanion;
        Iterator it7;
        Object next5;
        remeasure remeasureVar;
        ?? arrayList2;
        Iterator it8;
        Object next6;
        onNestedScrollAccepted onnestedscrollaccepted;
        transformedToOriginal transformedtooriginal;
        List list4;
        List list5;
        Object next7;
        accesssetSizep accesssetsizep;
        boolean z2;
        Iterator it9;
        Object next8;
        getLayoutParams getlayoutparams;
        Iterator it10;
        Object next9;
        getOnDensityChangedui getondensitychangedui;
        Iterator it11;
        Object next10;
        invalidateOrDeferlambda0 invalidateordeferlambda0;
        Iterator it12;
        Object next11;
        getOnRequestDisallowInterceptTouchEventui getonrequestdisallowintercepttoucheventui;
        String str6;
        boolean z3;
        getUpdate getupdate;
        String str7;
        String str8;
        PartialGapBuffer partialGapBuffer;
        PartialGapBuffer partialGapBuffer2;
        getIdentity getidentity;
        Iterator it13;
        Iterator it14;
        int i2;
        int i3 = 2 % 2;
        if (shortNewsContentCardView instanceof previewHandwritingGesture) {
            previewhandwritinggesture = (previewHandwritingGesture) shortNewsContentCardView;
            int i4 = previewhandwritinggesture.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IconCompatParcelizer + 101;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    previewhandwritinggesture.RemoteActionCompatParcelizer = i4 >>> Integer.MIN_VALUE;
                } else {
                    previewhandwritinggesture.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
                }
            } else {
                previewhandwritinggesture = new previewHandwritingGesture(this, shortNewsContentCardView);
            }
        } else {
            previewhandwritinggesture = new previewHandwritingGesture(this, shortNewsContentCardView);
        }
        Object obj2 = previewhandwritinggesture.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = previewhandwritinggesture.RemoteActionCompatParcelizer;
        boolean z4 = true;
        originalToTransformed originaltotransformed = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector2 = (FlowCollector) this.serializer;
            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj;
            ((g0) this.read).getClass();
            if (fastcoerceatmost != null) {
                int i7 = write + 23;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                boolean z5 = false;
                if (i7 % 2 != 0) {
                    androidViewBindinglambda00 = fastcoerceatmost.destinationInfoComponent;
                    int i8 = 25 / 0;
                    if (androidViewBindinglambda00 != null) {
                        list = androidViewBindinglambda00.components;
                        if (list != null) {
                            int i9 = IconCompatParcelizer + 49;
                            write = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            list2 = list;
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!(next instanceof accessgetOwnerp));
                            accessgetownerp = (accessgetOwnerp) next;
                            if (accessgetownerp != null) {
                                int i11 = write + 85;
                                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                it2 = accessgetownerp.components.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    i2 = write + 81;
                                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        boolean z6 = it2.next() instanceof accessinsetToLayoutPosition;
                                        originaltotransformed.hashCode();
                                        throw null;
                                    }
                                    next2 = it2.next();
                                } while (!(next2 instanceof accessinsetToLayoutPosition));
                                accessinsettolayoutposition = (accessinsetToLayoutPosition) next2;
                                if (accessinsettolayoutposition == null) {
                                    flowCollector = flowCollector2;
                                    coroutineSingletons = coroutineSingletons2;
                                    i = 1;
                                } else {
                                    list3 = accessinsettolayoutposition.components;
                                    it3 = list3.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it3.next();
                                    } while (!(next3 instanceof onNestedPreScroll));
                                    onnestedprescroll = (onNestedPreScroll) next3;
                                    List list6 = accessinsettolayoutposition.pictures;
                                    arrayList = new ArrayList();
                                    it4 = list6.iterator();
                                    while (it4.hasNext()) {
                                        accesssetsizep = (accesssetSizep) it4.next();
                                        if (onnestedprescroll != null) {
                                            z2 = z4;
                                        } else {
                                            z2 = z5;
                                        }
                                        List list7 = accesssetsizep.components;
                                        it9 = list7.iterator();
                                        do {
                                            if (it9.hasNext()) {
                                                next8 = null;
                                                break;
                                            }
                                            next8 = it9.next();
                                        } while (!(next8 instanceof getLayoutParams));
                                        getlayoutparams = (getLayoutParams) next8;
                                        it10 = list7.iterator();
                                        do {
                                            if (it10.hasNext()) {
                                                next9 = null;
                                                break;
                                            }
                                            next9 = it10.next();
                                        } while (!(next9 instanceof getOnDensityChangedui));
                                        getondensitychangedui = (getOnDensityChangedui) next9;
                                        it11 = list7.iterator();
                                        while (true) {
                                            if (it11.hasNext()) {
                                                next10 = null;
                                                break;
                                            }
                                            next10 = it11.next();
                                            it14 = it11;
                                            if (next10 instanceof invalidateOrDeferlambda0) {
                                                break;
                                            }
                                            it11 = it14;
                                        }
                                        invalidateordeferlambda0 = (invalidateOrDeferlambda0) next10;
                                        it12 = list7.iterator();
                                        while (true) {
                                            if (it12.hasNext()) {
                                                next11 = null;
                                                break;
                                            }
                                            next11 = it12.next();
                                            it13 = it12;
                                            if (next11 instanceof getOnRequestDisallowInterceptTouchEventui) {
                                                break;
                                            }
                                            it12 = it13;
                                        }
                                        getonrequestdisallowintercepttoucheventui = (getOnRequestDisallowInterceptTouchEventui) next11;
                                        str6 = accesssetsizep.pictureId;
                                        if (str6 == null) {
                                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("GalleryRemoteDataMapper mapping failed: pictureId was null", Timber.RemoteActionCompatParcelizer);
                                            flowCollector2 = flowCollector2;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            getidentity = null;
                                        } else {
                                            String str9 = accesssetsizep.url;
                                            if (getonrequestdisallowintercepttoucheventui == null && z2) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (getonrequestdisallowintercepttoucheventui != null) {
                                                getupdate = getonrequestdisallowintercepttoucheventui.request;
                                            } else {
                                                getupdate = null;
                                            }
                                            List list8 = accesssetsizep.tags;
                                            if (getlayoutparams != null) {
                                                int i13 = write + 59;
                                                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                                                int i14 = i13 % 2;
                                                str7 = getlayoutparams.title;
                                            } else {
                                                str7 = null;
                                            }
                                            if (getlayoutparams != null) {
                                                int i15 = write + 9;
                                                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                                                int i16 = i15 % 2;
                                                str8 = getlayoutparams.subtitle;
                                            } else {
                                                str8 = null;
                                            }
                                            if (getondensitychangedui != null) {
                                                int i17 = getondensitychangedui.count;
                                                boolean z7 = getondensitychangedui.hasPerformed;
                                                onNestedScroll onnestedscroll = getondensitychangedui.request;
                                                partialGapBuffer = new PartialGapBuffer(i17, z7, new OffsetMappingCompanionIdentity1(onnestedscroll.url, onnestedscroll.payload));
                                            } else {
                                                partialGapBuffer = null;
                                            }
                                            if (invalidateordeferlambda0 != null) {
                                                int i18 = invalidateordeferlambda0.count;
                                                boolean z8 = invalidateordeferlambda0.hasPerformed;
                                                onNestedScroll onnestedscroll2 = invalidateordeferlambda0.request;
                                                partialGapBuffer2 = new PartialGapBuffer(i18, z8, new OffsetMappingCompanionIdentity1(onnestedscroll2.url, onnestedscroll2.payload));
                                            } else {
                                                partialGapBuffer2 = null;
                                            }
                                            getidentity = new getIdentity(str6, str9, z3, getupdate, list8, str7, str8, partialGapBuffer, partialGapBuffer2);
                                        }
                                        if (getidentity != null) {
                                            arrayList.add(getidentity);
                                        }
                                        coroutineSingletons2 = coroutineSingletons2;
                                        it4 = it4;
                                        flowCollector2 = flowCollector2;
                                        z4 = true;
                                        z5 = false;
                                    }
                                    flowCollector = flowCollector2;
                                    coroutineSingletons = coroutineSingletons2;
                                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.isEmpty()) {
                                        it5 = list2.iterator();
                                        do {
                                            if (it5.hasNext()) {
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it5.next();
                                        } while (!(next4 instanceof AndroidViewBindingKtExternalSyntheticLambda7));
                                        androidViewBindingKtExternalSyntheticLambda7 = (AndroidViewBindingKtExternalSyntheticLambda7) next4;
                                        if (androidViewBindingKtExternalSyntheticLambda7 != null || (list5 = androidViewBindingKtExternalSyntheticLambda7.items) == null) {
                                            getbinding = null;
                                        } else {
                                            Iterator it15 = list5.iterator();
                                            do {
                                                if (!it15.hasNext()) {
                                                    next7 = null;
                                                    break;
                                                }
                                                next7 = it15.next();
                                            } while (!(next7 instanceof getBinding));
                                            getbinding = (getBinding) next7;
                                        }
                                        str = androidViewBindinglambda00.destinationName;
                                        if (str == null) {
                                            int i19 = write + 93;
                                            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                                            int i20 = i19 % 2;
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        String str10 = accessgetownerp.address;
                                        if (getbinding != null) {
                                            str3 = getbinding.text;
                                        } else {
                                            str3 = null;
                                        }
                                        if (getbinding != null) {
                                            zRemoteActionCompatParcelizer = getbinding.RemoteActionCompatParcelizer();
                                        } else {
                                            zRemoteActionCompatParcelizer = false;
                                        }
                                        if (getbinding != null) {
                                            str4 = getbinding.read();
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 == null) {
                                            str5 = "";
                                        } else {
                                            str5 = str4;
                                        }
                                        if (list3 instanceof Collection) {
                                            int i21 = IconCompatParcelizer + 97;
                                            write = i21 % Fields.SpotShadowColor;
                                            int i22 = i21 % 2;
                                            if (list3.isEmpty()) {
                                                z = false;
                                                break;
                                            }
                                            it6 = list3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    z = false;
                                                    break;
                                                }
                                                int i23 = write + 49;
                                                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                                                int i24 = i23 % 2;
                                                if (((insetValue) it6.next()) instanceof C0199requestDisallowInterceptTouchEvent) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            it6 = list3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    z = false;
                                                    break;
                                                }
                                                int i25 = write + 49;
                                                IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                                                int i26 = i25 % 2;
                                                if (((insetValue) it6.next()) instanceof C0199requestDisallowInterceptTouchEvent) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        if (onnestedprescroll != null) {
                                            List list9 = onnestedprescroll.components;
                                            it7 = list9.iterator();
                                            do {
                                                if (it7.hasNext()) {
                                                    next5 = null;
                                                    break;
                                                }
                                                next5 = it7.next();
                                            } while (!(next5 instanceof remeasure));
                                            remeasureVar = (remeasure) next5;
                                            if (remeasureVar != null || (list4 = remeasureVar.reasons) == null) {
                                                arrayList2 = 0;
                                            } else {
                                                List<requestChildRectangleOnScreen> list10 = list4;
                                                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
                                                for (requestChildRectangleOnScreen requestchildrectangleonscreen : list10) {
                                                    arrayList2.add(new OffsetMapping(requestchildrectangleonscreen.id, requestchildrectangleonscreen.title));
                                                }
                                            }
                                            if (arrayList2 == 0) {
                                                arrayList2 = instance_delegatelambda0.write;
                                            }
                                            ?? r10 = arrayList2;
                                            it8 = list9.iterator();
                                            do {
                                                if (it8.hasNext()) {
                                                    next6 = null;
                                                    break;
                                                }
                                                next6 = it8.next();
                                            } while (!(next6 instanceof onNestedScrollAccepted));
                                            onnestedscrollaccepted = (onNestedScrollAccepted) next6;
                                            String str11 = onnestedprescroll.title;
                                            String str12 = onnestedprescroll.subtitle;
                                            String str13 = onnestedprescroll.actionTitle;
                                            if (onnestedscrollaccepted != null) {
                                                transformedtooriginal = new transformedToOriginal(onnestedscrollaccepted.title, onnestedscrollaccepted.subtitle);
                                            } else {
                                                transformedtooriginal = null;
                                            }
                                            partialGapBufferCompanion = new PartialGapBufferCompanion(str11, str12, str13, r10, transformedtooriginal);
                                        } else {
                                            partialGapBufferCompanion = null;
                                        }
                                        originaltotransformed = new originalToTransformed(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, str2, str10, str3, zRemoteActionCompatParcelizer, str5, z, partialGapBufferCompanion);
                                        i = 1;
                                    }
                                }
                            }
                            i = 1;
                            originaltotransformed = null;
                        }
                    }
                } else {
                    androidViewBindinglambda00 = fastcoerceatmost.destinationInfoComponent;
                    if (androidViewBindinglambda00 != null) {
                        list = androidViewBindinglambda00.components;
                        if (list != null) {
                            int i27 = IconCompatParcelizer + 49;
                            write = i27 % Fields.SpotShadowColor;
                            int i110 = i27 % 2;
                            list2 = list;
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!(next instanceof accessgetOwnerp));
                            accessgetownerp = (accessgetOwnerp) next;
                            if (accessgetownerp != null) {
                                int i111 = write + 85;
                                IconCompatParcelizer = i111 % Fields.SpotShadowColor;
                                int i112 = i111 % 2;
                                it2 = accessgetownerp.components.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    i2 = write + 81;
                                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        boolean z9 = it2.next() instanceof accessinsetToLayoutPosition;
                                        originaltotransformed.hashCode();
                                        throw null;
                                    }
                                    next2 = it2.next();
                                } while (!(next2 instanceof accessinsetToLayoutPosition));
                                accessinsettolayoutposition = (accessinsetToLayoutPosition) next2;
                                if (accessinsettolayoutposition == null) {
                                    flowCollector = flowCollector2;
                                    coroutineSingletons = coroutineSingletons2;
                                    i = 1;
                                } else {
                                    list3 = accessinsettolayoutposition.components;
                                    it3 = list3.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it3.next();
                                    } while (!(next3 instanceof onNestedPreScroll));
                                    onnestedprescroll = (onNestedPreScroll) next3;
                                    List list11 = accessinsettolayoutposition.pictures;
                                    arrayList = new ArrayList();
                                    it4 = list11.iterator();
                                    while (it4.hasNext()) {
                                        accesssetsizep = (accesssetSizep) it4.next();
                                        if (onnestedprescroll != null) {
                                            z2 = z4;
                                        } else {
                                            z2 = z5;
                                        }
                                        List list12 = accesssetsizep.components;
                                        it9 = list12.iterator();
                                        do {
                                            if (it9.hasNext()) {
                                                next8 = null;
                                                break;
                                            }
                                            next8 = it9.next();
                                        } while (!(next8 instanceof getLayoutParams));
                                        getlayoutparams = (getLayoutParams) next8;
                                        it10 = list12.iterator();
                                        do {
                                            if (it10.hasNext()) {
                                                next9 = null;
                                                break;
                                            }
                                            next9 = it10.next();
                                        } while (!(next9 instanceof getOnDensityChangedui));
                                        getondensitychangedui = (getOnDensityChangedui) next9;
                                        it11 = list12.iterator();
                                        while (true) {
                                            if (it11.hasNext()) {
                                                next10 = null;
                                                break;
                                            }
                                            next10 = it11.next();
                                            it14 = it11;
                                            if (next10 instanceof invalidateOrDeferlambda0) {
                                                break;
                                                break;
                                            }
                                            it11 = it14;
                                        }
                                        invalidateordeferlambda0 = (invalidateOrDeferlambda0) next10;
                                        it12 = list12.iterator();
                                        while (true) {
                                            if (it12.hasNext()) {
                                                next11 = null;
                                                break;
                                            }
                                            next11 = it12.next();
                                            it13 = it12;
                                            if (next11 instanceof getOnRequestDisallowInterceptTouchEventui) {
                                                break;
                                                break;
                                            }
                                            it12 = it13;
                                        }
                                        getonrequestdisallowintercepttoucheventui = (getOnRequestDisallowInterceptTouchEventui) next11;
                                        str6 = accesssetsizep.pictureId;
                                        if (str6 == null) {
                                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("GalleryRemoteDataMapper mapping failed: pictureId was null", Timber.RemoteActionCompatParcelizer);
                                            flowCollector2 = flowCollector2;
                                            coroutineSingletons2 = coroutineSingletons2;
                                            getidentity = null;
                                        } else {
                                            String str14 = accesssetsizep.url;
                                            if (getonrequestdisallowintercepttoucheventui == null) {
                                                z3 = false;
                                            } else {
                                                z3 = false;
                                            }
                                            if (getonrequestdisallowintercepttoucheventui != null) {
                                                getupdate = getonrequestdisallowintercepttoucheventui.request;
                                            } else {
                                                getupdate = null;
                                            }
                                            List list13 = accesssetsizep.tags;
                                            if (getlayoutparams != null) {
                                                int i113 = write + 59;
                                                IconCompatParcelizer = i113 % Fields.SpotShadowColor;
                                                int i114 = i113 % 2;
                                                str7 = getlayoutparams.title;
                                            } else {
                                                str7 = null;
                                            }
                                            if (getlayoutparams != null) {
                                                int i115 = write + 9;
                                                IconCompatParcelizer = i115 % Fields.SpotShadowColor;
                                                int i116 = i115 % 2;
                                                str8 = getlayoutparams.subtitle;
                                            } else {
                                                str8 = null;
                                            }
                                            if (getondensitychangedui != null) {
                                                int i117 = getondensitychangedui.count;
                                                boolean z10 = getondensitychangedui.hasPerformed;
                                                onNestedScroll onnestedscroll3 = getondensitychangedui.request;
                                                partialGapBuffer = new PartialGapBuffer(i117, z10, new OffsetMappingCompanionIdentity1(onnestedscroll3.url, onnestedscroll3.payload));
                                            } else {
                                                partialGapBuffer = null;
                                            }
                                            if (invalidateordeferlambda0 != null) {
                                                int i118 = invalidateordeferlambda0.count;
                                                boolean z11 = invalidateordeferlambda0.hasPerformed;
                                                onNestedScroll onnestedscroll4 = invalidateordeferlambda0.request;
                                                partialGapBuffer2 = new PartialGapBuffer(i118, z11, new OffsetMappingCompanionIdentity1(onnestedscroll4.url, onnestedscroll4.payload));
                                            } else {
                                                partialGapBuffer2 = null;
                                            }
                                            getidentity = new getIdentity(str6, str14, z3, getupdate, list13, str7, str8, partialGapBuffer, partialGapBuffer2);
                                        }
                                        if (getidentity != null) {
                                            arrayList.add(getidentity);
                                        }
                                        coroutineSingletons2 = coroutineSingletons2;
                                        it4 = it4;
                                        flowCollector2 = flowCollector2;
                                        z4 = true;
                                        z5 = false;
                                    }
                                    flowCollector = flowCollector2;
                                    coroutineSingletons = coroutineSingletons2;
                                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.isEmpty()) {
                                        it5 = list2.iterator();
                                        do {
                                            if (it5.hasNext()) {
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it5.next();
                                        } while (!(next4 instanceof AndroidViewBindingKtExternalSyntheticLambda7));
                                        androidViewBindingKtExternalSyntheticLambda7 = (AndroidViewBindingKtExternalSyntheticLambda7) next4;
                                        if (androidViewBindingKtExternalSyntheticLambda7 != null) {
                                            getbinding = null;
                                        } else {
                                            getbinding = null;
                                        }
                                        str = androidViewBindinglambda00.destinationName;
                                        if (str == null) {
                                            int i119 = write + 93;
                                            IconCompatParcelizer = i119 % Fields.SpotShadowColor;
                                            int i28 = i119 % 2;
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        String str15 = accessgetownerp.address;
                                        if (getbinding != null) {
                                            str3 = getbinding.text;
                                        } else {
                                            str3 = null;
                                        }
                                        if (getbinding != null) {
                                            zRemoteActionCompatParcelizer = getbinding.RemoteActionCompatParcelizer();
                                        } else {
                                            zRemoteActionCompatParcelizer = false;
                                        }
                                        if (getbinding != null) {
                                            str4 = getbinding.read();
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 == null) {
                                            str5 = "";
                                        } else {
                                            str5 = str4;
                                        }
                                        if (list3 instanceof Collection) {
                                            int i29 = IconCompatParcelizer + 97;
                                            write = i29 % Fields.SpotShadowColor;
                                            int i210 = i29 % 2;
                                            if (list3.isEmpty()) {
                                                z = false;
                                                break;
                                            }
                                            it6 = list3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    z = false;
                                                    break;
                                                }
                                                int i211 = write + 49;
                                                IconCompatParcelizer = i211 % Fields.SpotShadowColor;
                                                int i212 = i211 % 2;
                                                if (((insetValue) it6.next()) instanceof C0199requestDisallowInterceptTouchEvent) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            it6 = list3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    z = false;
                                                    break;
                                                }
                                                int i213 = write + 49;
                                                IconCompatParcelizer = i213 % Fields.SpotShadowColor;
                                                int i214 = i213 % 2;
                                                if (((insetValue) it6.next()) instanceof C0199requestDisallowInterceptTouchEvent) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        if (onnestedprescroll != null) {
                                            List list14 = onnestedprescroll.components;
                                            it7 = list14.iterator();
                                            do {
                                                if (it7.hasNext()) {
                                                    next5 = null;
                                                    break;
                                                }
                                                next5 = it7.next();
                                            } while (!(next5 instanceof remeasure));
                                            remeasureVar = (remeasure) next5;
                                            if (remeasureVar != null) {
                                                arrayList2 = 0;
                                            } else {
                                                arrayList2 = 0;
                                            }
                                            if (arrayList2 == 0) {
                                                arrayList2 = instance_delegatelambda0.write;
                                            }
                                            ?? r11 = arrayList2;
                                            it8 = list14.iterator();
                                            do {
                                                if (it8.hasNext()) {
                                                    next6 = null;
                                                    break;
                                                }
                                                next6 = it8.next();
                                            } while (!(next6 instanceof onNestedScrollAccepted));
                                            onnestedscrollaccepted = (onNestedScrollAccepted) next6;
                                            String str16 = onnestedprescroll.title;
                                            String str17 = onnestedprescroll.subtitle;
                                            String str18 = onnestedprescroll.actionTitle;
                                            if (onnestedscrollaccepted != null) {
                                                transformedtooriginal = new transformedToOriginal(onnestedscrollaccepted.title, onnestedscrollaccepted.subtitle);
                                            } else {
                                                transformedtooriginal = null;
                                            }
                                            partialGapBufferCompanion = new PartialGapBufferCompanion(str16, str17, str18, r11, transformedtooriginal);
                                        } else {
                                            partialGapBufferCompanion = null;
                                        }
                                        originaltotransformed = new originalToTransformed(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, str2, str15, str3, zRemoteActionCompatParcelizer, str5, z, partialGapBufferCompanion);
                                        i = 1;
                                    }
                                }
                            }
                            i = 1;
                            originaltotransformed = null;
                        }
                    }
                }
                flowCollector = flowCollector2;
                coroutineSingletons = coroutineSingletons2;
                i = 1;
                originaltotransformed = null;
            } else {
                flowCollector = flowCollector2;
                coroutineSingletons = coroutineSingletons2;
                i = 1;
                originaltotransformed = null;
            }
            previewhandwritinggesture.RemoteActionCompatParcelizer = i;
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
            if (flowCollector.emit(originaltotransformed, previewhandwritinggesture) == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0278  */
    /* JADX WARN: Code duplicated, block: B:174:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:201:0x0342  */
    /* JADX WARN: Code duplicated, block: B:234:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:308:0x052a  */
    /* JADX WARN: Code duplicated, block: B:328:0x0587 A[PHI: r6 r9
  0x0587: PHI (r6v41 kotlinx.coroutines.flow.FlowCollector) = (r6v40 kotlinx.coroutines.flow.FlowCollector), (r6v43 kotlinx.coroutines.flow.FlowCollector) binds: [B:320:0x055d, B:326:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x0587: PHI (r9v30 int) = (r9v49 int), (r9v32 int) binds: [B:320:0x055d, B:326:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:343:0x05db  */
    /* JADX WARN: Code duplicated, block: B:368:0x064f  */
    /* JADX WARN: Code duplicated, block: B:415:0x0759  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:583:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:662:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x0169  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v53 java.lang.Object, still in use, count: 2, list:
          (r5v53 java.lang.Object) from 0x0411: INSTANCE_OF (r5v53 java.lang.Object) A[WRAPPED] (LINE:1099) o.getFocusTargetOfEmbeddedViewWrapper
          (r5v53 java.lang.Object) from 0x0417: PHI (r5 I:??) = (r5v50 java.lang.Object), (r5v53 java.lang.Object) binds: [B:253:0x0416, B:630:0x0417] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object r33, o.ShortNewsContentCardView r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ThumbNode$onAttach$1$1.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }
}
