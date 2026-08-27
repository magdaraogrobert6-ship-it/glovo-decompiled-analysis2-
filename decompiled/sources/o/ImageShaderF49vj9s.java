package o;

/* JADX INFO: loaded from: classes.dex */
public final class ImageShaderF49vj9s implements RadialGradientShader8uybcMk {
    public final accessrewindjd RemoteActionCompatParcelizer;
    public final Throwable read;
    public final ShaderKt write;

    @Override // o.RadialGradientShader8uybcMk
    public final accessrewindjd IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Throwable serializer() {
        return this.read;
    }

    @Override // o.RadialGradientShader8uybcMk
    public final ShaderKt write() {
        return this.write;
    }

    public ImageShaderF49vj9s(accessrewindjd accessrewindjdVar, ShaderKt shaderKt, Throwable th) {
        this.RemoteActionCompatParcelizer = accessrewindjdVar;
        this.write = shaderKt;
        this.read = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageShaderF49vj9s)) {
            return false;
        }
        ImageShaderF49vj9s imageShaderF49vj9s = (ImageShaderF49vj9s) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, imageShaderF49vj9s.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, imageShaderF49vj9s.write}, getCieXyz.write())).booleanValue() && this.read.equals(imageShaderF49vj9s.read);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.RemoteActionCompatParcelizer + ", request=" + this.write + ", throwable=" + this.read + ")";
    }

    public final int hashCode() {
        accessrewindjd accessrewindjdVar = this.RemoteActionCompatParcelizer;
        return this.read.hashCode() + ((this.write.hashCode() + ((accessrewindjdVar == null ? 0 : accessrewindjdVar.hashCode()) * 31)) * 31);
    }
}
