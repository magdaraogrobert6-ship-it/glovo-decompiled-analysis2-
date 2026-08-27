package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedContentSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedVisibilitySearchInfo;
import androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo;
import androidx.compose.ui.tooling.animation.search.SearchInfo;
import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import androidx.compose.ui.tooling.animation.search.UnsupportedSearchInfo;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import androidx.sqlite.SQLite;
import bo.app.f2$$ExternalSyntheticLambda4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.ArrangementHorizontal;
import o.ItemTouchHelperAdapter;
import o.PaddingKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.accessgetBlendMode0nO6VwUjd;
import o.accessgetInstancedelegatecp;
import o.calculateSnapOffset;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationSearch {
    public static final int $stable = 8;
    private final AnimatedContentSearch animatedContentSearch;
    private final AnimatedVisibilitySearch animatedVisibilitySearch;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 clock;
    private final Set<Search<? extends Object>> setToSearch;
    private final Set<Search<? extends Object>> setToTrack;
    private final Set<Search<? extends SearchInfo<? extends ComposeAnimation, ? extends ComposeAnimationClock<?, ?>>>> supportedSearch;
    private final TransitionSearch transitionSearch = new TransitionSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 3));

    public static final class DecaySearch extends RememberSearch<calculateSnapOffset> {
        public static final int $stable = 8;

        public DecaySearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(displayInAppMessagelambda1.serializer(calculateSnapOffset.class), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static abstract class Search<T> {
        public static final int $stable = 8;
        private final Set<T> animations = new LinkedHashSet();
        private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM trackAnimation;

        public void addAnimations(Collection<? extends Group> collection) {
        }

        public final Set<T> getAnimations() {
            return this.animations;
        }

        public abstract boolean hasAnimation(Group group);

        public final boolean hasAnimations(Collection<? extends Group> collection) {
            Collection<? extends Group> collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (hasAnimation((Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final void track() {
            List listMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat(this.animations);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.trackAnimation;
            Iterator<T> it = listMediaMetadataCompat.iterator();
            while (it.hasNext()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(it.next());
            }
        }

        public Search(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.trackAnimation = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    public static final class TargetBasedSearch extends RememberSearch<PaddingKt> {
        public static final int $stable = 8;

        public TargetBasedSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(displayInAppMessagelambda1.serializer(PaddingKt.class), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachAllAnimations$lambda$0$0(Group group) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean searchAny$lambda$0$0(Group group) {
        return true;
    }

    public static class RememberSearch<T> extends Search<T> {
        public static final int $stable = 8;
        private final getUnregisteredInAppMessageannotations clazz;

        public RememberSearch(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            this.clazz = getunregisteredinappmessageannotations;
        }

        private final <T> T findRememberCallWithType(Group group, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
            T next;
            Iterator<T> it = group.getData().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{next != null ? displayInAppMessagelambda1.serializer(next.getClass()) : null, getunregisteredinappmessageannotations}, getCieXyz.write())).booleanValue());
            getunregisteredinappmessageannotations.getClass();
            if (!((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).read(next)) {
                return null;
            }
            next.getClass();
            return next;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                if (((Group) t).getLocation() != null) {
                    arrayList.add(t);
                }
            }
            getAnimations().addAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(findRememberCallWithType(arrayList, this.clazz)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return (group.getLocation() == null || findRememberCallWithType(group, this.clazz) == null) ? false : true;
        }

        private final <T> List<T> findRememberCallWithType(Collection<? extends Group> collection, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T tFindRememberCallWithType = findRememberCallWithType((Group) it.next(), getunregisteredinappmessageannotations);
                if (tFindRememberCallWithType != null) {
                    arrayList.add(tFindRememberCallWithType);
                }
            }
            return arrayList;
        }
    }

    private final Collection<AnimateXAsStateSearch> animateXAsStateSearch() {
        return AnimateXAsStateComposeAnimation.Companion.getApiAvailable() ? RangesKt.write(new AnimateXAsStateSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 6))) : instance_delegatelambda0.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel animateXAsStateSearch$lambda$0(AnimationSearch animationSearch, AnimateXAsStateSearchInfo animateXAsStateSearchInfo) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(animateXAsStateSearchInfo);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel animatedContentSearch$lambda$0(AnimationSearch animationSearch, AnimatedContentSearchInfo animatedContentSearchInfo) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(animatedContentSearchInfo);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel animatedVisibilitySearch$lambda$0(AnimationSearch animationSearch, AnimatedVisibilitySearchInfo animatedVisibilitySearchInfo) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(animatedVisibilitySearchInfo);
        return createFromParcel.INSTANCE;
    }

    private final Set<InfiniteTransitionSearch> infiniteTransitionSearch() {
        return InfiniteTransitionComposeAnimation.Companion.getApiAvailable() ? RangesKt.write(new InfiniteTransitionSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 7))) : ItemTouchHelperAdapter.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel infiniteTransitionSearch$lambda$0(AnimationSearch animationSearch, InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(infiniteTransitionSearchInfo);
        return createFromParcel.INSTANCE;
    }

    private final Set<Search<? extends SearchInfo<? extends ComposeAnimation, ? extends ComposeAnimationClock<?, ?>>>> supportedSearch() {
        return RangesKt.read(RangesKt.read(RangesKt.read(onContentCardClicked.MediaSessionCompatQueueItem(new Search[]{this.transitionSearch, this.animatedVisibilitySearch}), animateXAsStateSearch()), infiniteTransitionSearch()), AnimatedContentComposeAnimation.Companion.getApiAvailable() ? RangesKt.write(this.animatedContentSearch) : ItemTouchHelperAdapter.serializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel transitionSearch$lambda$0(AnimationSearch animationSearch, TransitionSearchInfo transitionSearchInfo) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(transitionSearchInfo);
        return createFromParcel.INSTANCE;
    }

    private final Collection<Search<? extends Object>> unsupportedSearch() {
        return UnsupportedComposeAnimation.Companion.getApiAvailable() ? onContentCardClicked.MediaSessionCompatQueueItem(new Search[]{new AnimateContentSizeSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 0)), new TargetBasedSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 1)), new DecaySearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 2))}) : instance_delegatelambda0.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel unsupportedSearch$lambda$0(AnimationSearch animationSearch, Object obj) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(new UnsupportedSearchInfo(obj, "animateContentSize"));
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel unsupportedSearch$lambda$1(AnimationSearch animationSearch, PaddingKt paddingKt) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(new UnsupportedSearchInfo(paddingKt, "TargetBasedAnimation"));
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel unsupportedSearch$lambda$2(AnimationSearch animationSearch, calculateSnapOffset calculatesnapoffset) {
        ((PreviewAnimationClock) animationSearch.clock.invoke()).trackComposeAnimation(new UnsupportedSearchInfo(calculatesnapoffset, "DecayAnimation"));
        return createFromParcel.INSTANCE;
    }

    public final void attachAllAnimations(Collection<? extends Group> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it.next(), new accessgetBlendMode0nO6VwUjd(6));
            Iterator<T> it2 = this.setToSearch.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).addAnimations(listFindAll);
            }
            Set<AnimatedVisibilitySearchInfo> animations = this.animatedVisibilitySearch.getAnimations();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(animations, 10));
            Iterator<T> it3 = animations.iterator();
            while (it3.hasNext()) {
                arrayList.add(((AnimatedVisibilitySearchInfo) it3.next()).getTransition());
            }
            Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
            Set<AnimatedContentSearchInfo> animations2 = this.animatedContentSearch.getAnimations();
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(animations2, 10));
            Iterator<T> it4 = animations2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((AnimatedContentSearchInfo) it4.next()).getTransition());
            }
            LinkedHashSet linkedHashSet = RangesKt.read(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2));
            Set<TransitionSearchInfo> animations3 = this.transitionSearch.getAnimations();
            f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4 = new f2$$ExternalSyntheticLambda4(1, linkedHashSet);
            animations3.getClass();
            onContentCardDismissed.serializer((Iterable) animations3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) f2__externalsyntheticlambda4, true);
        }
        Iterator<T> it5 = this.setToTrack.iterator();
        while (it5.hasNext()) {
            ((Search) it5.next()).track();
        }
    }

    public final boolean searchAny(Collection<? extends Group> collection) {
        Collection<? extends Group> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it.next(), new accessgetBlendMode0nO6VwUjd(7));
            Set<Search<? extends SearchInfo<? extends ComposeAnimation, ? extends ComposeAnimationClock<?, ?>>>> set = this.supportedSearch;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((Search) it2.next()).hasAnimations(listFindAll)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 8;

        public AnimateContentSizeSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addAnimations$lambda$1$0$0(AnimateContentSizeSearch animateContentSizeSearch, Modifier.Element element) {
            if (!element.getClass().getName().equals("androidx.compose.animation.SizeAnimationModifierElement")) {
                return false;
            }
            animateContentSizeSearch.getAnimations().add(element);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean hasAnimation$lambda$0$0(Modifier.Element element) {
            return element.getClass().getName().equals("androidx.compose.animation.SizeAnimationModifierElement");
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!((Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).getModifier().any(new f2$$ExternalSyntheticLambda4(2, this));
                }
            }
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (group.getModifierInfo().isEmpty()) {
                return false;
            }
            List<ModifierInfo> modifierInfo = group.getModifierInfo();
            if ((modifierInfo instanceof Collection) && modifierInfo.isEmpty()) {
                return false;
            }
            Iterator<T> it = modifierInfo.iterator();
            while (it.hasNext()) {
                if (((ModifierInfo) it.next()).getModifier().any(new accessgetBlendMode0nO6VwUjd(8))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 8;

        public AnimateXAsStateSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        private final <T> Animatable findAnimatable(CallGroup callGroup) {
            T next;
            Collection collection;
            T next2;
            T next3;
            Iterator<T> it = callGroup.getData().iterator();
            do {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof Animatable));
            if (!(next instanceof Animatable)) {
                next = null;
            }
            Animatable animatable = next;
            if (animatable != null) {
                int iSerializer = getQueryParameterslambda2.serializer();
                collection = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{animatable}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            } else {
                collection = instance_delegatelambda0.write;
            }
            Collection collection2 = collection;
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(next3 instanceof Animatable));
                if (!(next3 instanceof Animatable)) {
                    next3 = null;
                }
                Animatable animatable2 = next3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList2.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                do {
                    if (!it6.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it6.next();
                } while (!(next2 instanceof Animatable));
                if (!(next2 instanceof Animatable)) {
                    next2 = null;
                }
                Animatable animatable3 = next2;
                if (animatable3 != null) {
                    arrayList3.add(animatable3);
                }
            }
            return (Animatable) onContentCardDismissed.MediaMetadataCompat((List) onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(arrayList3, arrayList), collection2));
        }

        private final <T> TrackpadScrollingLogic findAnimationSpec(CallGroup callGroup) {
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            for (T t : children) {
                Object[] objArr = {((Group) t).getName(), "rememberUpdatedState"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it.next()).getChildren(), (Collection) arrayList2);
            }
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayListIconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it2.next()).getData(), (Collection) arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (obj instanceof onViewAttachedToWindow) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((onViewAttachedToWindow) it3.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                if (obj2 instanceof TrackpadScrollingLogic) {
                    arrayList6.add(obj2);
                }
            }
            return (TrackpadScrollingLogic) onContentCardDismissed.MediaMetadataCompat((List) arrayList6);
        }

        private final <T> List<AnimateXAsStateSearchInfo<T, TransformGestureDetectorKtdetectTransformGestures2>> findAnimations(Collection<? extends Group> collection) {
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Animatable animatableFindAnimatable = findAnimatable(callGroup);
                TrackpadScrollingLogic trackpadScrollingLogicFindAnimationSpec = findAnimationSpec(callGroup);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7FindToolingOverride = findToolingOverride(callGroup);
                AnimateXAsStateSearchInfo animateXAsStateSearchInfo = null;
                animateXAsStateSearchInfo = null;
                animateXAsStateSearchInfo = null;
                if (animatableFindAnimatable != null && trackpadScrollingLogicFindAnimationSpec != null && populateViewStructure_androidKtpopulate7FindToolingOverride != null) {
                    Object value = populateViewStructure_androidKtpopulate7FindToolingOverride.getValue();
                    ToolingState toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(animatableFindAnimatable.write());
                    }
                    animateXAsStateSearchInfo = new AnimateXAsStateSearchInfo(animatableFindAnimatable, trackpadScrollingLogicFindAnimationSpec, new ToolingOverride(populateViewStructure_androidKtpopulate7FindToolingOverride, toolingState));
                    animateXAsStateSearchInfo.attach();
                }
                if (animateXAsStateSearchInfo != null) {
                    arrayList2.add(animateXAsStateSearchInfo);
                }
            }
            return arrayList2;
        }

        private final <T> PopulateViewStructure_androidKtpopulate7 findToolingOverride(Group group) {
            T next;
            Collection collection;
            T next2;
            T next3;
            Iterator<T> it = group.getData().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PopulateViewStructure_androidKtpopulate7));
            if (!(next instanceof PopulateViewStructure_androidKtpopulate7)) {
                next = null;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) next;
            if (populateViewStructure_androidKtpopulate7 != null) {
                int iSerializer = getQueryParameterslambda2.serializer();
                collection = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{populateViewStructure_androidKtpopulate7}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            } else {
                collection = instance_delegatelambda0.write;
            }
            Collection collection2 = collection;
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(next3 instanceof PopulateViewStructure_androidKtpopulate7));
                if (!(next3 instanceof PopulateViewStructure_androidKtpopulate7)) {
                    next3 = null;
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) next3;
                if (populateViewStructure_androidKtpopulate8 != null) {
                    arrayList.add(populateViewStructure_androidKtpopulate8);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList2.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                do {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                } while (!(next2 instanceof PopulateViewStructure_androidKtpopulate7));
                if (!(next2 instanceof PopulateViewStructure_androidKtpopulate7)) {
                    next2 = null;
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) next2;
                if (populateViewStructure_androidKtpopulate9 != null) {
                    arrayList3.add(populateViewStructure_androidKtpopulate9);
                }
            }
            return (PopulateViewStructure_androidKtpopulate7) onContentCardDismissed.MediaMetadataCompat((List) onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(arrayList3, arrayList), collection2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0034  */
        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{group.getName(), "animateValueAsState"}, getCieXyz.write())).booleanValue()) {
                    group = null;
                }
            } else {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            CallGroup animationGroup = toAnimationGroup(group);
            return (animationGroup == null || findAnimatable(animationGroup) == null || findAnimationSpec(animationGroup) == null || findToolingOverride(animationGroup) == null) ? false : true;
        }
    }

    public static final class AnimatedContentSearch extends Search<AnimatedContentSearchInfo> {
        public static final int $stable = 8;

        public AnimatedContentSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<AnimatedContentSearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof Transition));
                Transition transition = (Transition) (next2 instanceof Transition ? next2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList3.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof Transition));
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList4, arrayList2);
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
            Iterator it7 = arrayListIconCompatParcelizer.iterator();
            while (it7.hasNext()) {
                arrayList5.add(new AnimatedContentSearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList5);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0034  */
        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{group.getName(), "AnimatedContent"}, getCieXyz.write())).booleanValue()) {
                    group = null;
                }
            } else {
                group = null;
            }
            if (group == null) {
                return null;
            }
            for (Object obj2 : group.getChildren()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Group) obj2).getName(), "updateTransition"}, getCieXyz.write())).booleanValue()) {
                    obj = obj2;
                    break;
                }
            }
            return (Group) obj;
        }
    }

    public static final class AnimatedVisibilitySearch extends Search<AnimatedVisibilitySearchInfo> {
        public static final int $stable = 8;

        public AnimatedVisibilitySearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<AnimatedVisibilitySearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof Transition));
                Transition transition = (Transition) (next2 instanceof Transition ? next2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList3.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof Transition));
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList4, arrayList2);
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
            Iterator it7 = arrayListIconCompatParcelizer.iterator();
            while (it7.hasNext()) {
                arrayList5.add(new AnimatedVisibilitySearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList5);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0034  */
        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{group.getName(), "AnimatedVisibility"}, getCieXyz.write())).booleanValue()) {
                    group = null;
                }
            } else {
                group = null;
            }
            if (group == null) {
                return null;
            }
            for (Object obj2 : group.getChildren()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Group) obj2).getName(), "updateTransition"}, getCieXyz.write())).booleanValue()) {
                    obj = obj2;
                    break;
                }
            }
            return (Group) obj;
        }
    }

    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 8;

        public InfiniteTransitionSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        private final List<InfiniteTransitionSearchInfo> findAnimations(Collection<? extends Group> collection) {
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo;
            Object next;
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Collection<Object> data = callGroup.getData();
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = children.iterator();
                while (it2.hasNext()) {
                    onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it2.next()).getData(), (Collection) arrayList3);
                }
                Iterator it3 = onContentCardDismissed.IconCompatParcelizer(arrayList3, data).iterator();
                do {
                    infiniteTransitionSearchInfo = null;
                    infiniteTransitionSearchInfo = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!(next instanceof ArrangementHorizontal));
                if (!(next instanceof ArrangementHorizontal)) {
                    next = null;
                }
                ArrangementHorizontal arrangementHorizontal = (ArrangementHorizontal) next;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7FindToolingOverride = findToolingOverride(callGroup);
                if (arrangementHorizontal != null && populateViewStructure_androidKtpopulate7FindToolingOverride != null) {
                    Object value = populateViewStructure_androidKtpopulate7FindToolingOverride.getValue();
                    ToolingState toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(0L);
                    }
                    infiniteTransitionSearchInfo = new InfiniteTransitionSearchInfo(arrangementHorizontal, new ToolingOverride(populateViewStructure_androidKtpopulate7FindToolingOverride, toolingState));
                    infiniteTransitionSearchInfo.attach();
                }
                if (infiniteTransitionSearchInfo != null) {
                    arrayList2.add(infiniteTransitionSearchInfo);
                }
            }
            return arrayList2;
        }

        private final PopulateViewStructure_androidKtpopulate7 findToolingOverride(Group group) {
            Object next;
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it.next()).getChildren(), (Collection) arrayList);
            }
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, children);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListIconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it2.next()).getData(), (Collection) arrayList2);
            }
            Iterator it3 = onContentCardDismissed.IconCompatParcelizer(arrayList2, data).iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(next instanceof PopulateViewStructure_androidKtpopulate7));
            return (PopulateViewStructure_androidKtpopulate7) (next instanceof PopulateViewStructure_androidKtpopulate7 ? next : null);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            Object next;
            if (toAnimationGroup(group) == null) {
                return false;
            }
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it.next()).getData(), (Collection) arrayList);
            }
            Iterator it2 = onContentCardDismissed.IconCompatParcelizer(arrayList, data).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(next instanceof ArrangementHorizontal));
            return (((ArrangementHorizontal) (next instanceof ArrangementHorizontal ? next : null)) == null || findToolingOverride(group) == null) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0034  */
        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{group.getName(), "rememberInfiniteTransition"}, getCieXyz.write())).booleanValue()) {
                    group = null;
                }
            } else {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }
    }

    public static final class TransitionSearch extends Search<TransitionSearchInfo> {
        public static final int $stable = 8;

        public TransitionSearch(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<TransitionSearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof Transition));
                Transition transition = (Transition) (next2 instanceof Transition ? next2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList3.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof Transition));
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList4, arrayList2);
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
            Iterator it7 = arrayListIconCompatParcelizer.iterator();
            while (it7.hasNext()) {
                arrayList5.add(new TransitionSearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList5);
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() == null) {
                return null;
            }
            Object[] objArr = {group.getName(), "updateTransition"};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return group;
            }
            return null;
        }
    }

    public AnimationSearch(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.clock = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 4));
        this.animatedContentSearch = animatedContentSearch;
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new AnimationSearch$$ExternalSyntheticLambda2(this, 5));
        Set<Search<? extends SearchInfo<? extends ComposeAnimation, ? extends ComposeAnimationClock<?, ?>>>> setSupportedSearch = supportedSearch();
        this.supportedSearch = setSupportedSearch;
        LinkedHashSet linkedHashSet = RangesKt.read(setSupportedSearch, unsupportedSearch());
        this.setToTrack = linkedHashSet;
        this.setToSearch = RangesKt.read(linkedHashSet, RangesKt.write(animatedContentSearch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachAllAnimations$lambda$0$4(Set set, TransitionSearchInfo transitionSearchInfo) {
        return set.contains(transitionSearchInfo.getTransition());
    }
}
