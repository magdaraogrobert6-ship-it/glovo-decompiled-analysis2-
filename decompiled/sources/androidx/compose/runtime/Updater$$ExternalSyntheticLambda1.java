package androidx.compose.runtime;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.sqlite.SQLite;
import bo.app.a5$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgh;
import com.incognia.EventProperties;
import com.roadrunner.helpcenter.floating.HelpCenterEntryPointKt;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.bottomsheet.separator.SeparatorItemKt;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationParams;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.opportunities.api.navigation.BonusCalendarParams;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import o.AndroidContentCaptureManager;
import o.BlockInnerShadowNodeobtainPainter1;
import o.DrawableTransformation;
import o.ImageOnlyContentCardViewViewHolder;
import o.RetainInstanceUsageViolation;
import o.ShortNewsContentCardViewViewHolder;
import o.TargetFragmentUsageViolation;
import o.Violation;
import o.WrongFragmentContainerViolation;
import o.accessisMainThread;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.createButtonClickListeners;
import o.createFromAutofillValue;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.div7Ah8Wj8;
import o.firstDescendantOrNull;
import o.generateActivityResultKey;
import o.getAddressStreet;
import o.getBirthDateFull;
import o.getCreditCardExpirationDay;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getOnContentCaptureSession;
import o.getPostalCode;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isMainThread;
import o.notifySubtreeStateChangeIfNeeded;
import o.onAnimationEndlambda1;
import o.onContentCardDismissed;
import o.onCreateVirtualViewTranslationRequests;
import o.onViewAttachedToWindowlambda0;
import o.onViewStateRestored;
import o.onVirtualViewTranslationResponses;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;
import o.r8lambdamozw6ZoaAoZNw1t4cWNRQL95S0U;
import o.r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.registerInAppMessageManagerlambda0;
import o.relocationOffsetfbGrOKE;
import o.sendContentCaptureAppearEvents;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setFlags;
import o.setSpread;
import o.shouldIgnore;
import o.waitTime;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Updater$$ExternalSyntheticLambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ Updater$$ExternalSyntheticLambda1(waitTime waittime, FragmentActivity fragmentActivity) {
        this.RemoteActionCompatParcelizer = 14;
        this.write = fragmentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x031a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x031c A[LOOP:3: B:113:0x02e2->B:126:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x0324  */
    /* JADX WARN: Code duplicated, block: B:217:0x04af  */
    /* JADX WARN: Code duplicated, block: B:244:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        createTouchAwareListener createtouchawarelistenerParcelableVolumeInfo;
        r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4;
        Collection collectionIconCompatParcelizer;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        int i = 7;
        long j = -9187201950435737472L;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write).invoke(obj);
                return createFromParcel.INSTANCE;
            case 1:
                return IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) ((Alignment.Horizontal) this.write).align(0, (int) (((IntSize) obj).m3848unboximpl() >> 32), (LayoutDirection) obj2)) << 32));
            case 2:
                return IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) ((Alignment.Vertical) this.write).align(0, (int) (((IntSize) obj).m3848unboximpl() & 4294967295L))) & 4294967295L));
            case 3:
                return IntOffset.m3792boximpl(((Alignment) this.write).mo139alignKFBX0sM(IntSize.Companion.m3849getZeroYbymL2g(), ((IntSize) obj).m3848unboximpl(), (LayoutDirection) obj2));
            case 4:
                firstDescendantOrNull firstdescendantornull = (firstDescendantOrNull) this.write;
                ((Integer) obj).getClass();
                if (obj2 instanceof getAddressStreet) {
                    getAddressStreet getaddressstreet = (getAddressStreet) obj2;
                    relocationOffsetfbGrOKE relocationoffsetfbgroke = (relocationOffsetfbGrOKE) firstdescendantornull.RatingCompat;
                    if (relocationoffsetfbgroke == null) {
                        relocationOffsetfbGrOKE relocationoffsetfbgroke2 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                        relocationoffsetfbgroke = new relocationOffsetfbGrOKE();
                        firstdescendantornull.RatingCompat = relocationoffsetfbgroke;
                    }
                    relocationoffsetfbgroke.RemoteActionCompatParcelizer(getaddressstreet);
                    ((onCreateVirtualViewTranslationRequests) firstdescendantornull.write).IconCompatParcelizer(getaddressstreet);
                }
                if (obj2 instanceof createFromAutofillValue) {
                    firstdescendantornull.serializer((createFromAutofillValue) obj2);
                }
                if (obj2 instanceof getHandleruiannotations) {
                    ((getHandleruiannotations) obj2).RemoteActionCompatParcelizer();
                }
                return createFromParcel.INSTANCE;
            case 5:
                sendContentCaptureAppearEvents sendcontentcaptureappearevents = (sendContentCaptureAppearEvents) this.write;
                Set set = (Set) obj;
                synchronized (sendcontentcaptureappearevents.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                    if (((notifySubtreeStateChangeIfNeeded) sendcontentcaptureappearevents.write.read()).compareTo(notifySubtreeStateChangeIfNeeded.Idle) >= 0) {
                        relocationOffsetfbGrOKE relocationoffsetfbgroke3 = sendcontentcaptureappearevents.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        if (set instanceof onVirtualViewTranslationResponses) {
                            awaitTouchSlopOrCancellationjO51t88 awaittouchsloporcancellationjo51t88 = ((onVirtualViewTranslationResponses) set).IconCompatParcelizer;
                            Object[] objArr = awaittouchsloporcancellationjo51t88.RemoteActionCompatParcelizer;
                            long[] jArr = awaittouchsloporcancellationjo51t88.IconCompatParcelizer;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << i) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((j2 & 255) < 128) {
                                                Object obj3 = objArr[(i2 << 3) + i4];
                                                if (!(obj3 instanceof BlockInnerShadowNodeobtainPainter1) || ((BlockInnerShadowNodeobtainPainter1) obj3).write(1)) {
                                                    relocationoffsetfbgroke3.serializer(obj3);
                                                }
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 == 8) {
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                        i = 7;
                                    }
                                }
                            }
                        } else {
                            for (Object obj4 : set) {
                                if (!(obj4 instanceof BlockInnerShadowNodeobtainPainter1) || ((BlockInnerShadowNodeobtainPainter1) obj4).write(1)) {
                                    relocationoffsetfbgroke3.serializer(obj4);
                                }
                            }
                        }
                        createtouchawarelistenerParcelableVolumeInfo = sendcontentcaptureappearevents.ParcelableVolumeInfo();
                    } else {
                        createtouchawarelistenerParcelableVolumeInfo = null;
                    }
                    break;
                }
                if (createtouchawarelistenerParcelableVolumeInfo != null) {
                    ((CancellableContinuationImpl) createtouchawarelistenerParcelableVolumeInfo).resumeWith(createFromParcel.INSTANCE);
                }
                return createFromParcel.INSTANCE;
            case 6:
                getOnContentCaptureSession getoncontentcapturesession = (getOnContentCaptureSession) this.write;
                Set set2 = (Set) obj;
                synchronized (getoncontentcapturesession.MediaSessionCompatQueueItem) {
                    relocationOffsetfbGrOKE relocationoffsetfbgroke4 = getoncontentcapturesession.serializer;
                    if (relocationoffsetfbgroke4 == null) {
                        if (onContentCardDismissed.write(set2, getoncontentcapturesession.IconCompatParcelizer)) {
                            r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = getoncontentcapturesession.RemoteActionCompatParcelizer;
                        } else {
                            r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = null;
                        }
                    } else {
                        Object[] objArr2 = relocationoffsetfbgroke4.RemoteActionCompatParcelizer;
                        long[] jArr2 = relocationoffsetfbgroke4.IconCompatParcelizer;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j3 = jArr2[i5];
                                if ((((~j3) << 7) & j3 & j) != j) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= i6) {
                                            if (i6 == 8) {
                                                if (i5 != length2) {
                                                    i5++;
                                                    j = -9187201950435737472L;
                                                }
                                            }
                                            r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = null;
                                        } else if ((j3 & 255) >= 128 || !set2.contains(objArr2[(i5 << 3) + i7])) {
                                            j3 >>= 8;
                                            i7++;
                                        } else {
                                            r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = getoncontentcapturesession.RemoteActionCompatParcelizer;
                                        }
                                    }
                                } else if (i5 != length2) {
                                    i5++;
                                    j = -9187201950435737472L;
                                } else {
                                    r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = null;
                                }
                            }
                        } else {
                            r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = null;
                        }
                    }
                }
                if (r8lambdahgodiqgpbyai8pyonaxx8pbqx4 != null) {
                    r8lambdahgodiqgpbyai8pyonaxx8pbqx4.b_(createFromParcel.INSTANCE);
                }
                return createFromParcel.INSTANCE;
            case 7:
                setSpread setspread = (setSpread) this.write;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = setspread.MediaMetadataCompat;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        collectionIconCompatParcelizer = collection;
                    } else if (obj5 instanceof Set) {
                        collectionIconCompatParcelizer = SQLite.read(obj5, collection);
                    } else if (obj5 instanceof List) {
                        collectionIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{collection}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), (Collection) obj5);
                    } else {
                        getCreditCardExpirationDay.IconCompatParcelizer("Unexpected notification");
                        DrawableTransformation.read();
                        return null;
                    }
                    do {
                        if (atomicReference.compareAndSet(obj5, collectionIconCompatParcelizer)) {
                            if (setspread.write()) {
                                setspread.MediaSessionCompatQueueItem.invoke(new a5$$ExternalSyntheticLambda0(i, setspread));
                            }
                            return createFromParcel.INSTANCE;
                        }
                    } while (atomicReference.get() == obj5);
                }
                break;
            case 8:
                generateActivityResultKey generateactivityresultkey = (generateActivityResultKey) this.write;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    HelpCenterEntryPointKt.HelpCenterEntryPoint(generateactivityresultkey, null, getpostalcode, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            case 9:
                onViewStateRestored onviewstaterestored = (onViewStateRestored) this.write;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    SeparatorItemKt.SeparatorItem(onviewstaterestored, null, getpostalcode2, 0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            case 10:
                WrongFragmentContainerViolation wrongFragmentContainerViolation = (WrongFragmentContainerViolation) this.write;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    TargetFragmentUsageViolation targetFragmentUsageViolation = (TargetFragmentUsageViolation) ExtrasKt.write(wrongFragmentContainerViolation.RemoteActionCompatParcelizer, getpostalcode3, 0).getValue();
                    boolean z = targetFragmentUsageViolation instanceof Violation;
                    Violation violation = z ? (Violation) targetFragmentUsageViolation : null;
                    String str = violation != null ? violation.read : null;
                    LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, null, str == null ? "" : str, null, RetainInstanceUsageViolation.serializer, getpostalcode3, 24576, 10);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            case 11:
                EventProperties eventProperties = (EventProperties) this.write;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                eventProperties.set(str2, str3);
                return createFromParcel.INSTANCE;
            case 12:
                setFlags setflags = (setFlags) this.write;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                shouldIgnore shouldignore = (shouldIgnore) obj2;
                fragmentActivity.getClass();
                shouldignore.getClass();
                accessisMainThread accessismainthread = setflags.read;
                div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                accessismainthread.getClass();
                zzgh.serializer(new BookShiftConfirmationParams(shouldignore.write(), (String) shouldIgnore.IconCompatParcelizer(r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 462833260, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -462833260, new Object[]{shouldignore}), shouldignore.serializer(), shouldignore.MediaDescriptionCompat(), shouldignore.IconCompatParcelizer(), shouldignore.MediaBrowserCompatMediaItem())).RemoteActionCompatParcelizer(supportFragmentManager, "com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment");
                return createFromParcel.INSTANCE;
            case 13:
                return RouterActivity.IconCompatParcelizer((RouterActivity) this.write, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 14:
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.write;
                int iIntValue4 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                str4.getClass();
                isMainThread.write(fragmentActivity2, new BonusCalendarParams(str4, iIntValue4));
                return createFromParcel.INSTANCE;
            case 15:
                r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = (r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) this.write;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc r8lambdaomj_unyzprj1upaauufsp7i4jfc = (r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc) ExtrasKt.write(r8lambdap8kvrporasful_ov_pvwbybk_ny.RatingCompat, getpostalcode4, 0).getValue();
                    boolean z2 = getpostalcode4.read(r8lambdap8kvrporasful_ov_pvwbybk_ny);
                    Object objComponentActivity = getpostalcode4.ComponentActivity();
                    if (z2 || objComponentActivity == androidContentCaptureManager) {
                        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, r8lambdap8kvrporasful_ov_pvwbybk_ny, r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY.class, "onSideMenuItemClick", "onSideMenuItemClick()V", 0, 18);
                        getpostalcode4.write(roomDatabase$closeBarrier$1);
                        objComponentActivity = roomDatabase$closeBarrier$1;
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    boolean z3 = getpostalcode4.read(r8lambdap8kvrporasful_ov_pvwbybk_ny);
                    Object objComponentActivity2 = getpostalcode4.ComponentActivity();
                    if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                        HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, r8lambdap8kvrporasful_ov_pvwbybk_ny, r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY.class, "onTooltipVisible", "onTooltipVisible(Ljava/lang/String;)V", 0, 26);
                        getpostalcode4.write(anonymousClass1);
                        objComponentActivity2 = anonymousClass1;
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    boolean z4 = getpostalcode4.read(r8lambdap8kvrporasful_ov_pvwbybk_ny);
                    Object objComponentActivity3 = getpostalcode4.ComponentActivity();
                    if (z4 || objComponentActivity3 == androidContentCaptureManager) {
                        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$2 = new RoomDatabase$closeBarrier$1(0, r8lambdap8kvrporasful_ov_pvwbybk_ny, r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 19);
                        getpostalcode4.write(roomDatabase$closeBarrier$2);
                        objComponentActivity3 = roomDatabase$closeBarrier$2;
                    }
                    r8lambdamozw6ZoaAoZNw1t4cWNRQL95S0U.RemoteActionCompatParcelizer(r8lambdaomj_unyzprj1upaauufsp7i4jfc, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, null, getpostalcode4, 0);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            case 16:
                char[] cArr = (char[]) this.write;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(charSequence, cArr, iIntValue6, false);
                if (iIconCompatParcelizer < 0) {
                    return null;
                }
                return new onViewAttachedToWindowlambda0(Integer.valueOf(iIconCompatParcelizer), 1);
            default:
                SafeCollector safeCollector = (SafeCollector) this.write;
                int iIntValue7 = ((Integer) obj).intValue();
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj2;
                ImageOnlyContentCardViewViewHolder key = shortNewsContentCardViewViewHolder.getKey();
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = safeCollector.RemoteActionCompatParcelizer.get(key);
                if (key == onAnimationEndlambda1.RemoteActionCompatParcelizer) {
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) shortNewsContentCardViewViewHolder2;
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0E_ = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) shortNewsContentCardViewViewHolder;
                    while (true) {
                        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0E_ == null) {
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0 = null;
                        } else if (setallviewgroupchildrenasnonaccessibilityimportantlambda0E_ != setallviewgroupchildrenasnonaccessibilityimportantlambda1 && (setallviewgroupchildrenasnonaccessibilityimportantlambda0E_ instanceof ScopeCoroutine)) {
                            createButtonClickListeners createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper = ((ScopeCoroutine) setallviewgroupchildrenasnonaccessibilityimportantlambda0E_).MediaSessionCompatResultReceiverWrapper();
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0E_ = createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper != null ? createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper.E_() : null;
                        } else {
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0 = setallviewgroupchildrenasnonaccessibilityimportantlambda0E_;
                        }
                    }
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != setallviewgroupchildrenasnonaccessibilityimportantlambda1) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + setallviewgroupchildrenasnonaccessibilityimportantlambda0 + ", expected child of " + setallviewgroupchildrenasnonaccessibilityimportantlambda1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                        iIntValue7++;
                    }
                } else if (shortNewsContentCardViewViewHolder != shortNewsContentCardViewViewHolder2) {
                    iIntValue7 = Integer.MIN_VALUE;
                } else {
                    iIntValue7++;
                }
                return Integer.valueOf(iIntValue7);
        }
    }

    public /* synthetic */ Updater$$ExternalSyntheticLambda1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }
}
