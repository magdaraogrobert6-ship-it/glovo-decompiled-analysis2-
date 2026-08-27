package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class getShadowContext {
    public static final RotateKt read = new RotateKt();

    public static void RemoteActionCompatParcelizer(int i, setAlignment setalignment, rotate rotateVar, boolean z) {
        float f = setalignment.fullyDrawnReporter_delegatelambda0;
        paintdefault paintdefaultVar = setalignment.onBackPressedDispatcher_delegatelambda010;
        int iRemoteActionCompatParcelizer = paintdefaultVar.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        paintdefault paintdefaultVar2 = setalignment.invalidateMenu;
        int iRemoteActionCompatParcelizer2 = paintdefaultVar2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        int iSerializer = paintdefaultVar.serializer();
        int iSerializer2 = paintdefaultVar2.serializer();
        if (iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
            f = 0.5f;
        } else {
            iRemoteActionCompatParcelizer += iSerializer;
            iRemoteActionCompatParcelizer2 -= iSerializer2;
        }
        int iMediaSessionCompatQueueItem = setalignment.MediaSessionCompatQueueItem();
        int i2 = (iRemoteActionCompatParcelizer2 - iRemoteActionCompatParcelizer) - iMediaSessionCompatQueueItem;
        if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
            i2 = (iRemoteActionCompatParcelizer - iRemoteActionCompatParcelizer2) - iMediaSessionCompatQueueItem;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iRemoteActionCompatParcelizer;
        int i4 = i3 + iMediaSessionCompatQueueItem;
        if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
            i4 = i3 - iMediaSessionCompatQueueItem;
        }
        setalignment.IconCompatParcelizer(i3, i4);
        IconCompatParcelizer(i + 1, setalignment, rotateVar, z);
    }

    public static void read(int i, setAlignment setalignment, rotate rotateVar, setAlignment setalignment2) {
        float f = setalignment2.onBackPressed;
        paintdefault paintdefaultVar = setalignment2.onActivityResult;
        int iSerializer = paintdefaultVar.serializer() + paintdefaultVar.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        paintdefault paintdefaultVar2 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        int iRemoteActionCompatParcelizer = paintdefaultVar2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer() - paintdefaultVar2.serializer();
        if (iRemoteActionCompatParcelizer >= iSerializer) {
            int iMediaDescriptionCompat = setalignment2.MediaDescriptionCompat();
            if (setalignment2.onMultiWindowModeChanged != 8) {
                int i2 = setalignment2.addMenuProvider;
                if (i2 == 2) {
                    iMediaDescriptionCompat = (int) (f * 0.5f * (setalignment instanceof getUseIntrinsicSize ? setalignment.MediaDescriptionCompat() : setalignment.getViewModelStore.MediaDescriptionCompat()));
                } else if (i2 == 0) {
                    iMediaDescriptionCompat = iRemoteActionCompatParcelizer - iSerializer;
                }
                iMediaDescriptionCompat = Math.max(setalignment2.enterPictureInPictureMode, iMediaDescriptionCompat);
                int i3 = setalignment2.addOnPictureInPictureModeChangedListener;
                if (i3 > 0) {
                    iMediaDescriptionCompat = Math.min(i3, iMediaDescriptionCompat);
                }
            }
            int i4 = iSerializer + ((int) ((f * ((iRemoteActionCompatParcelizer - iSerializer) - iMediaDescriptionCompat)) + 0.5f));
            setalignment2.write(i4, iMediaDescriptionCompat + i4);
            IconCompatParcelizer(i + 1, setalignment2, rotateVar);
        }
    }

    public static void serializer(int i, setAlignment setalignment, rotate rotateVar, setAlignment setalignment2, boolean z) {
        float f = setalignment2.fullyDrawnReporter_delegatelambda0;
        paintdefault paintdefaultVar = setalignment2.onBackPressedDispatcher_delegatelambda010;
        int iSerializer = paintdefaultVar.serializer() + paintdefaultVar.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        paintdefault paintdefaultVar2 = setalignment2.invalidateMenu;
        int iRemoteActionCompatParcelizer = paintdefaultVar2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer() - paintdefaultVar2.serializer();
        if (iRemoteActionCompatParcelizer >= iSerializer) {
            int iMediaSessionCompatQueueItem = setalignment2.MediaSessionCompatQueueItem();
            if (setalignment2.onMultiWindowModeChanged != 8) {
                int i2 = setalignment2.addOnConfigurationChangedListener;
                if (i2 == 2) {
                    iMediaSessionCompatQueueItem = (int) (setalignment2.fullyDrawnReporter_delegatelambda0 * 0.5f * (setalignment instanceof getUseIntrinsicSize ? setalignment.MediaSessionCompatQueueItem() : setalignment.getViewModelStore.MediaSessionCompatQueueItem()));
                } else if (i2 == 0) {
                    iMediaSessionCompatQueueItem = iRemoteActionCompatParcelizer - iSerializer;
                }
                iMediaSessionCompatQueueItem = Math.max(setalignment2.addOnTrimMemoryListener, iMediaSessionCompatQueueItem);
                int i3 = setalignment2.addOnPictureInPictureUiStateChangedListener;
                if (i3 > 0) {
                    iMediaSessionCompatQueueItem = Math.min(i3, iMediaSessionCompatQueueItem);
                }
            }
            int i4 = iSerializer + ((int) ((f * ((iRemoteActionCompatParcelizer - iSerializer) - iMediaSessionCompatQueueItem)) + 0.5f));
            setalignment2.IconCompatParcelizer(i4, iMediaSessionCompatQueueItem + i4);
            IconCompatParcelizer(i + 1, setalignment2, rotateVar, z);
        }
    }

    public static void write(int i, setAlignment setalignment, rotate rotateVar) {
        float f = setalignment.onBackPressed;
        paintdefault paintdefaultVar = setalignment.onActivityResult;
        int iRemoteActionCompatParcelizer = paintdefaultVar.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        paintdefault paintdefaultVar2 = setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        int iRemoteActionCompatParcelizer2 = paintdefaultVar2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        int iSerializer = paintdefaultVar.serializer();
        int iSerializer2 = paintdefaultVar2.serializer();
        if (iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
            f = 0.5f;
        } else {
            iRemoteActionCompatParcelizer += iSerializer;
            iRemoteActionCompatParcelizer2 -= iSerializer2;
        }
        int iMediaDescriptionCompat = setalignment.MediaDescriptionCompat();
        int i2 = (iRemoteActionCompatParcelizer2 - iRemoteActionCompatParcelizer) - iMediaDescriptionCompat;
        if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
            i2 = (iRemoteActionCompatParcelizer - iRemoteActionCompatParcelizer2) - iMediaDescriptionCompat;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iRemoteActionCompatParcelizer + i3;
        int i5 = i4 + iMediaDescriptionCompat;
        if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
            i4 = iRemoteActionCompatParcelizer - i3;
            i5 = i4 - iMediaDescriptionCompat;
        }
        setalignment.write(i4, i5);
        IconCompatParcelizer(i + 1, setalignment, rotateVar);
    }

    public static boolean IconCompatParcelizer(setAlignment setalignment) {
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasspecifiedandfiniteheightuvyycjkArr[0];
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjkArr[1];
        getUseIntrinsicSize getuseintrinsicsize = setalignment.getViewModelStore;
        if (getuseintrinsicsize == null) {
            getuseintrinsicsize = null;
        }
        if (getuseintrinsicsize != null) {
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = getuseintrinsicsize.addOnNewIntentListener[0];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        }
        if (getuseintrinsicsize != null) {
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk7 = getuseintrinsicsize.addOnNewIntentListener[1];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        }
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk9 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        boolean z = hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk9 || setalignment.j_() || hasspecifiedandfiniteheightuvyycjk3 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT || (hasspecifiedandfiniteheightuvyycjk3 == (hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) && setalignment.addOnConfigurationChangedListener == 0 && setalignment.createFullyDrawnExecutor == 0.0f && setalignment.MediaBrowserCompatMediaItem(0)) || (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk2 && setalignment.addOnConfigurationChangedListener == 1 && setalignment.read(0, setalignment.MediaSessionCompatQueueItem()));
        boolean z2 = hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk9 || setalignment.RemoteActionCompatParcelizer() || hasspecifiedandfiniteheightuvyycjk4 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT || (hasspecifiedandfiniteheightuvyycjk4 == (hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) && setalignment.addMenuProvider == 0 && setalignment.createFullyDrawnExecutor == 0.0f && setalignment.MediaBrowserCompatMediaItem(1)) || (hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk && setalignment.addMenuProvider == 1 && setalignment.read(1, setalignment.MediaDescriptionCompat()));
        return (setalignment.createFullyDrawnExecutor > 0.0f && (z || z2)) || (z && z2);
    }

    public static void IconCompatParcelizer(int i, setAlignment setalignment, rotate rotateVar) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        paintdefault paintdefaultVar3;
        paintdefault paintdefaultVar4;
        if (setalignment.onMenuItemSelected) {
            return;
        }
        if (!(setalignment instanceof getUseIntrinsicSize) && setalignment.PlaybackStateCompat() && IconCompatParcelizer(setalignment)) {
            getUseIntrinsicSize.read(setalignment, rotateVar, new RotateKt());
        }
        paintdefault paintdefaultVarRemoteActionCompatParcelizer = setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP);
        paintdefault paintdefaultVarRemoteActionCompatParcelizer2 = setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM);
        int iRemoteActionCompatParcelizer = paintdefaultVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = paintdefaultVarRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
        HashSet<paintdefault> hashSet = paintdefaultVarRemoteActionCompatParcelizer.write;
        char c = 1;
        if (hashSet != null && paintdefaultVarRemoteActionCompatParcelizer.read) {
            for (paintdefault paintdefaultVar5 : hashSet) {
                setAlignment setalignment2 = paintdefaultVar5.RatingCompat;
                int i2 = i + 1;
                boolean zIconCompatParcelizer = IconCompatParcelizer(setalignment2);
                paintdefault paintdefaultVar6 = setalignment2.onActivityResult;
                paintdefault paintdefaultVar7 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (setalignment2.PlaybackStateCompat() && zIconCompatParcelizer) {
                    getUseIntrinsicSize.read(setalignment2, rotateVar, new RotateKt());
                }
                char c2 = ((paintdefaultVar5 == paintdefaultVar6 && (paintdefaultVar4 = paintdefaultVar7.MediaSessionCompatQueueItem) != null && paintdefaultVar4.read) || (paintdefaultVar5 == paintdefaultVar7 && (paintdefaultVar3 = paintdefaultVar6.MediaSessionCompatQueueItem) != null && paintdefaultVar3.read)) ? c : (char) 0;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = setalignment2.addOnNewIntentListener[c];
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2 && !zIconCompatParcelizer) {
                    if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2 && setalignment2.addOnPictureInPictureModeChangedListener >= 0 && setalignment2.enterPictureInPictureMode >= 0 && ((setalignment2.onMultiWindowModeChanged == 8 || (setalignment2.addMenuProvider == 0 && setalignment2.createFullyDrawnExecutor == 0.0f)) && !setalignment2.PlaybackStateCompatCustomAction() && !setalignment2.onBackPressedDispatcher_delegatelambda0 && c2 != 0 && !setalignment2.PlaybackStateCompatCustomAction())) {
                        read(i2, setalignment, rotateVar, setalignment2);
                    }
                } else if (!setalignment2.PlaybackStateCompat()) {
                    if (paintdefaultVar5 == paintdefaultVar6 && paintdefaultVar7.MediaSessionCompatQueueItem == null) {
                        int iSerializer = paintdefaultVar6.serializer() + iRemoteActionCompatParcelizer;
                        setalignment2.write(iSerializer, setalignment2.MediaDescriptionCompat() + iSerializer);
                        IconCompatParcelizer(i2, setalignment2, rotateVar);
                    } else if (paintdefaultVar5 == paintdefaultVar7 && paintdefaultVar6.MediaSessionCompatQueueItem == null) {
                        int iSerializer2 = iRemoteActionCompatParcelizer - paintdefaultVar7.serializer();
                        setalignment2.write(iSerializer2 - setalignment2.MediaDescriptionCompat(), iSerializer2);
                        IconCompatParcelizer(i2, setalignment2, rotateVar);
                    } else if (c2 != 0 && !setalignment2.PlaybackStateCompatCustomAction()) {
                        write(i2, setalignment2, rotateVar);
                    }
                }
                c = 1;
            }
        }
        if (setalignment instanceof setSizeToIntrinsics) {
            return;
        }
        HashSet<paintdefault> hashSet2 = paintdefaultVarRemoteActionCompatParcelizer2.write;
        if (hashSet2 != null && paintdefaultVarRemoteActionCompatParcelizer2.read) {
            for (paintdefault paintdefaultVar8 : hashSet2) {
                setAlignment setalignment3 = paintdefaultVar8.RatingCompat;
                int i3 = i + 1;
                boolean zIconCompatParcelizer2 = IconCompatParcelizer(setalignment3);
                paintdefault paintdefaultVar9 = setalignment3.onActivityResult;
                paintdefault paintdefaultVar10 = setalignment3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (setalignment3.PlaybackStateCompat() && zIconCompatParcelizer2) {
                    getUseIntrinsicSize.read(setalignment3, rotateVar, new RotateKt());
                }
                boolean z = (paintdefaultVar8 == paintdefaultVar9 && (paintdefaultVar2 = paintdefaultVar10.MediaSessionCompatQueueItem) != null && paintdefaultVar2.read) || (paintdefaultVar8 == paintdefaultVar10 && (paintdefaultVar = paintdefaultVar9.MediaSessionCompatQueueItem) != null && paintdefaultVar.read);
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = setalignment3.addOnNewIntentListener[1];
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && !zIconCompatParcelizer2) {
                    if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && setalignment3.addOnPictureInPictureModeChangedListener >= 0 && setalignment3.enterPictureInPictureMode >= 0 && (setalignment3.onMultiWindowModeChanged == 8 || (setalignment3.addMenuProvider == 0 && setalignment3.createFullyDrawnExecutor == 0.0f))) {
                        if (!setalignment3.PlaybackStateCompatCustomAction() && !setalignment3.onBackPressedDispatcher_delegatelambda0 && z && !setalignment3.PlaybackStateCompatCustomAction()) {
                            read(i3, setalignment, rotateVar, setalignment3);
                        }
                    }
                } else if (!setalignment3.PlaybackStateCompat()) {
                    if (paintdefaultVar8 == paintdefaultVar9 && paintdefaultVar10.MediaSessionCompatQueueItem == null) {
                        int iSerializer3 = paintdefaultVar9.serializer() + iRemoteActionCompatParcelizer2;
                        setalignment3.write(iSerializer3, setalignment3.MediaDescriptionCompat() + iSerializer3);
                        IconCompatParcelizer(i3, setalignment3, rotateVar);
                    } else if (paintdefaultVar8 == paintdefaultVar10 && paintdefaultVar9.MediaSessionCompatQueueItem == null) {
                        int iSerializer4 = iRemoteActionCompatParcelizer2 - paintdefaultVar10.serializer();
                        setalignment3.write(iSerializer4 - setalignment3.MediaDescriptionCompat(), iSerializer4);
                        IconCompatParcelizer(i3, setalignment3, rotateVar);
                    } else if (z && !setalignment3.PlaybackStateCompatCustomAction()) {
                        write(i3, setalignment3, rotateVar);
                    }
                }
            }
        }
        paintdefault paintdefaultVarRemoteActionCompatParcelizer3 = setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BASELINE);
        if (paintdefaultVarRemoteActionCompatParcelizer3.write != null && paintdefaultVarRemoteActionCompatParcelizer3.read) {
            int iRemoteActionCompatParcelizer3 = paintdefaultVarRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer();
            for (paintdefault paintdefaultVar11 : paintdefaultVarRemoteActionCompatParcelizer3.write) {
                setAlignment setalignment4 = paintdefaultVar11.RatingCompat;
                boolean zIconCompatParcelizer3 = IconCompatParcelizer(setalignment4);
                paintdefault paintdefaultVar12 = setalignment4.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                if (setalignment4.PlaybackStateCompat() && zIconCompatParcelizer3) {
                    getUseIntrinsicSize.read(setalignment4, rotateVar, new RotateKt());
                }
                if (setalignment4.addOnNewIntentListener[1] != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT || zIconCompatParcelizer3) {
                    if (!setalignment4.PlaybackStateCompat()) {
                        if (paintdefaultVar11 == paintdefaultVar12) {
                            int iSerializer5 = paintdefaultVar11.serializer() + iRemoteActionCompatParcelizer3;
                            if (setalignment4.addObserverForBackInvokerlambda0) {
                                int i4 = iSerializer5 - setalignment4.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                int i5 = setalignment4.addObserverForBackInvoker;
                                setalignment4.onRetainNonConfigurationInstance = i4;
                                setalignment4.onActivityResult.RemoteActionCompatParcelizer(i4);
                                setalignment4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(i5 + i4);
                                paintdefaultVar12.RemoteActionCompatParcelizer(iSerializer5);
                                setalignment4.onConfigurationChanged = true;
                            }
                            IconCompatParcelizer(i + 1, setalignment4, rotateVar);
                        }
                    }
                }
            }
        }
        setalignment.onMenuItemSelected = true;
    }

    public static void IconCompatParcelizer(int i, setAlignment setalignment, rotate rotateVar, boolean z) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        paintdefault paintdefaultVar3;
        paintdefault paintdefaultVar4;
        if (setalignment.fullyDrawnReporter_delegatelambda00) {
            return;
        }
        if (!(setalignment instanceof getUseIntrinsicSize) && setalignment.PlaybackStateCompat() && IconCompatParcelizer(setalignment)) {
            getUseIntrinsicSize.read(setalignment, rotateVar, new RotateKt());
        }
        paintdefault paintdefaultVarRemoteActionCompatParcelizer = setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT);
        paintdefault paintdefaultVarRemoteActionCompatParcelizer2 = setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT);
        int iRemoteActionCompatParcelizer = paintdefaultVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = paintdefaultVarRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
        HashSet<paintdefault> hashSet = paintdefaultVarRemoteActionCompatParcelizer.write;
        char c = 0;
        if (hashSet != null && paintdefaultVarRemoteActionCompatParcelizer.read) {
            for (paintdefault paintdefaultVar5 : hashSet) {
                setAlignment setalignment2 = paintdefaultVar5.RatingCompat;
                int i2 = i + 1;
                boolean zIconCompatParcelizer = IconCompatParcelizer(setalignment2);
                paintdefault paintdefaultVar6 = setalignment2.onBackPressedDispatcher_delegatelambda010;
                paintdefault paintdefaultVar7 = setalignment2.invalidateMenu;
                if (setalignment2.PlaybackStateCompat() && zIconCompatParcelizer) {
                    getUseIntrinsicSize.read(setalignment2, rotateVar, new RotateKt());
                }
                char c2 = ((paintdefaultVar5 == paintdefaultVar6 && (paintdefaultVar4 = paintdefaultVar7.MediaSessionCompatQueueItem) != null && paintdefaultVar4.read) || (paintdefaultVar5 == paintdefaultVar7 && (paintdefaultVar3 = paintdefaultVar6.MediaSessionCompatQueueItem) != null && paintdefaultVar3.read)) ? (char) 1 : c;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = setalignment2.addOnNewIntentListener[c];
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2 && !zIconCompatParcelizer) {
                    if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2 && setalignment2.addOnPictureInPictureUiStateChangedListener >= 0 && setalignment2.addOnTrimMemoryListener >= 0 && ((setalignment2.onMultiWindowModeChanged == 8 || (setalignment2.addOnConfigurationChangedListener == 0 && setalignment2.createFullyDrawnExecutor == 0.0f)) && !setalignment2.ParcelableVolumeInfo() && !setalignment2.onBackPressedDispatcher_delegatelambda0 && c2 != 0 && !setalignment2.ParcelableVolumeInfo())) {
                        serializer(i2, setalignment, rotateVar, setalignment2, z);
                    }
                } else if (!setalignment2.PlaybackStateCompat()) {
                    if (paintdefaultVar5 == paintdefaultVar6 && paintdefaultVar7.MediaSessionCompatQueueItem == null) {
                        int iSerializer = paintdefaultVar6.serializer() + iRemoteActionCompatParcelizer;
                        setalignment2.IconCompatParcelizer(iSerializer, setalignment2.MediaSessionCompatQueueItem() + iSerializer);
                        IconCompatParcelizer(i2, setalignment2, rotateVar, z);
                    } else if (paintdefaultVar5 == paintdefaultVar7 && paintdefaultVar6.MediaSessionCompatQueueItem == null) {
                        int iSerializer2 = iRemoteActionCompatParcelizer - paintdefaultVar7.serializer();
                        setalignment2.IconCompatParcelizer(iSerializer2 - setalignment2.MediaSessionCompatQueueItem(), iSerializer2);
                        IconCompatParcelizer(i2, setalignment2, rotateVar, z);
                    } else if (c2 != 0 && !setalignment2.ParcelableVolumeInfo()) {
                        RemoteActionCompatParcelizer(i2, setalignment2, rotateVar, z);
                    }
                }
                c = 0;
            }
        }
        if (setalignment instanceof setSizeToIntrinsics) {
            return;
        }
        HashSet<paintdefault> hashSet2 = paintdefaultVarRemoteActionCompatParcelizer2.write;
        if (hashSet2 != null && paintdefaultVarRemoteActionCompatParcelizer2.read) {
            for (paintdefault paintdefaultVar8 : hashSet2) {
                setAlignment setalignment3 = paintdefaultVar8.RatingCompat;
                int i3 = i + 1;
                boolean zIconCompatParcelizer2 = IconCompatParcelizer(setalignment3);
                paintdefault paintdefaultVar9 = setalignment3.onBackPressedDispatcher_delegatelambda010;
                paintdefault paintdefaultVar10 = setalignment3.invalidateMenu;
                if (setalignment3.PlaybackStateCompat() && zIconCompatParcelizer2) {
                    getUseIntrinsicSize.read(setalignment3, rotateVar, new RotateKt());
                }
                boolean z2 = (paintdefaultVar8 == paintdefaultVar9 && (paintdefaultVar2 = paintdefaultVar10.MediaSessionCompatQueueItem) != null && paintdefaultVar2.read) || (paintdefaultVar8 == paintdefaultVar10 && (paintdefaultVar = paintdefaultVar9.MediaSessionCompatQueueItem) != null && paintdefaultVar.read);
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = setalignment3.addOnNewIntentListener[0];
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && !zIconCompatParcelizer2) {
                    if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && setalignment3.addOnPictureInPictureUiStateChangedListener >= 0 && setalignment3.addOnTrimMemoryListener >= 0) {
                        if (setalignment3.onMultiWindowModeChanged == 8 || (setalignment3.addOnConfigurationChangedListener == 0 && setalignment3.createFullyDrawnExecutor == 0.0f)) {
                            if (!setalignment3.ParcelableVolumeInfo() && !setalignment3.onBackPressedDispatcher_delegatelambda0 && z2 && !setalignment3.ParcelableVolumeInfo()) {
                                serializer(i3, setalignment, rotateVar, setalignment3, z);
                            }
                        }
                    }
                } else if (!setalignment3.PlaybackStateCompat()) {
                    if (paintdefaultVar8 == paintdefaultVar9 && paintdefaultVar10.MediaSessionCompatQueueItem == null) {
                        int iSerializer3 = paintdefaultVar9.serializer() + iRemoteActionCompatParcelizer2;
                        setalignment3.IconCompatParcelizer(iSerializer3, setalignment3.MediaSessionCompatQueueItem() + iSerializer3);
                        IconCompatParcelizer(i3, setalignment3, rotateVar, z);
                    } else if (paintdefaultVar8 == paintdefaultVar10 && paintdefaultVar9.MediaSessionCompatQueueItem == null) {
                        int iSerializer4 = iRemoteActionCompatParcelizer2 - paintdefaultVar10.serializer();
                        setalignment3.IconCompatParcelizer(iSerializer4 - setalignment3.MediaSessionCompatQueueItem(), iSerializer4);
                        IconCompatParcelizer(i3, setalignment3, rotateVar, z);
                    } else if (z2 && !setalignment3.ParcelableVolumeInfo()) {
                        RemoteActionCompatParcelizer(i3, setalignment3, rotateVar, z);
                    }
                }
            }
        }
        setalignment.fullyDrawnReporter_delegatelambda00 = true;
    }
}
