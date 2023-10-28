//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.17 at 10:53:10 PM CDT 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{}func_group"/&gt;
 *         &lt;element ref="{}value"/&gt;
 *         &lt;element ref="{}property"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table",
    "product",
    "difference",
    "sum",
    "quotient",
    "pow",
    "abs",
    "sin",
    "cos",
    "tan",
    "asin",
    "acos",
    "atan",
    "atan2",
    "min",
    "max",
    "avg",
    "fraction",
    "integer",
    "mod",
    "random",
    "urandom",
    "pi",
    "lt",
    "le",
    "gt",
    "ge",
    "eq",
    "nq",
    "and",
    "or",
    "not",
    "ifthen",
    "_switch",
    "interpolate1D",
    "value",
    "property"
})
@XmlRootElement(name = "sin")
public class Sin {

    protected Table table;
    protected Product product;
    protected Difference difference;
    protected Sum sum;
    protected Quotient quotient;
    protected Pow pow;
    protected Abs abs;
    protected Sin sin;
    protected Cos cos;
    protected Tan tan;
    protected Asin asin;
    protected Acos acos;
    protected Atan atan;
    protected Atan2 atan2;
    protected Min min;
    protected Max max;
    protected Avg avg;
    protected Fraction fraction;
    protected Integer integer;
    protected Mod mod;
    protected Object random;
    protected Object urandom;
    protected Object pi;
    protected Lt lt;
    protected Le le;
    protected Gt gt;
    protected Ge ge;
    protected Eq eq;
    protected Nq nq;
    protected And and;
    protected Or or;
    protected Not not;
    protected Ifthen ifthen;
    @XmlElement(name = "switch")
    protected Ifthen.Switch _switch;
    @XmlElement(name = "interpolate1d")
    protected Interpolate1D interpolate1D;
    protected Double value;
    protected String property;

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link Difference }
     *     
     */
    public Difference getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Difference }
     *     
     */
    public void setDifference(Difference value) {
        this.difference = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link Sum }
     *     
     */
    public Sum getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sum }
     *     
     */
    public void setSum(Sum value) {
        this.sum = value;
    }

    /**
     * Gets the value of the quotient property.
     * 
     * @return
     *     possible object is
     *     {@link Quotient }
     *     
     */
    public Quotient getQuotient() {
        return quotient;
    }

    /**
     * Sets the value of the quotient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quotient }
     *     
     */
    public void setQuotient(Quotient value) {
        this.quotient = value;
    }

    /**
     * Gets the value of the pow property.
     * 
     * @return
     *     possible object is
     *     {@link Pow }
     *     
     */
    public Pow getPow() {
        return pow;
    }

    /**
     * Sets the value of the pow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pow }
     *     
     */
    public void setPow(Pow value) {
        this.pow = value;
    }

    /**
     * Gets the value of the abs property.
     * 
     * @return
     *     possible object is
     *     {@link Abs }
     *     
     */
    public Abs getAbs() {
        return abs;
    }

    /**
     * Sets the value of the abs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abs }
     *     
     */
    public void setAbs(Abs value) {
        this.abs = value;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link Sin }
     *     
     */
    public Sin getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sin }
     *     
     */
    public void setSin(Sin value) {
        this.sin = value;
    }

    /**
     * Gets the value of the cos property.
     * 
     * @return
     *     possible object is
     *     {@link Cos }
     *     
     */
    public Cos getCos() {
        return cos;
    }

    /**
     * Sets the value of the cos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cos }
     *     
     */
    public void setCos(Cos value) {
        this.cos = value;
    }

    /**
     * Gets the value of the tan property.
     * 
     * @return
     *     possible object is
     *     {@link Tan }
     *     
     */
    public Tan getTan() {
        return tan;
    }

    /**
     * Sets the value of the tan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tan }
     *     
     */
    public void setTan(Tan value) {
        this.tan = value;
    }

    /**
     * Gets the value of the asin property.
     * 
     * @return
     *     possible object is
     *     {@link Asin }
     *     
     */
    public Asin getAsin() {
        return asin;
    }

    /**
     * Sets the value of the asin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asin }
     *     
     */
    public void setAsin(Asin value) {
        this.asin = value;
    }

    /**
     * Gets the value of the acos property.
     * 
     * @return
     *     possible object is
     *     {@link Acos }
     *     
     */
    public Acos getAcos() {
        return acos;
    }

    /**
     * Sets the value of the acos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acos }
     *     
     */
    public void setAcos(Acos value) {
        this.acos = value;
    }

    /**
     * Gets the value of the atan property.
     * 
     * @return
     *     possible object is
     *     {@link Atan }
     *     
     */
    public Atan getAtan() {
        return atan;
    }

    /**
     * Sets the value of the atan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atan }
     *     
     */
    public void setAtan(Atan value) {
        this.atan = value;
    }

    /**
     * Gets the value of the atan2 property.
     * 
     * @return
     *     possible object is
     *     {@link Atan2 }
     *     
     */
    public Atan2 getAtan2() {
        return atan2;
    }

    /**
     * Sets the value of the atan2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atan2 }
     *     
     */
    public void setAtan2(Atan2 value) {
        this.atan2 = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Min }
     *     
     */
    public Min getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Min }
     *     
     */
    public void setMin(Min value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Max }
     *     
     */
    public Max getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max }
     *     
     */
    public void setMax(Max value) {
        this.max = value;
    }

    /**
     * Gets the value of the avg property.
     * 
     * @return
     *     possible object is
     *     {@link Avg }
     *     
     */
    public Avg getAvg() {
        return avg;
    }

    /**
     * Sets the value of the avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avg }
     *     
     */
    public void setAvg(Avg value) {
        this.avg = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     * @return
     *     possible object is
     *     {@link Fraction }
     *     
     */
    public Fraction getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fraction }
     *     
     */
    public void setFraction(Fraction value) {
        this.fraction = value;
    }

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteger(Integer value) {
        this.integer = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Mod }
     *     
     */
    public Mod getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mod }
     *     
     */
    public void setMod(Mod value) {
        this.mod = value;
    }

    /**
     * Gets the value of the random property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRandom() {
        return random;
    }

    /**
     * Sets the value of the random property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRandom(Object value) {
        this.random = value;
    }

    /**
     * Gets the value of the urandom property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUrandom() {
        return urandom;
    }

    /**
     * Sets the value of the urandom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUrandom(Object value) {
        this.urandom = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPi() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPi(Object value) {
        this.pi = value;
    }

    /**
     * Gets the value of the lt property.
     * 
     * @return
     *     possible object is
     *     {@link Lt }
     *     
     */
    public Lt getLt() {
        return lt;
    }

    /**
     * Sets the value of the lt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lt }
     *     
     */
    public void setLt(Lt value) {
        this.lt = value;
    }

    /**
     * Gets the value of the le property.
     * 
     * @return
     *     possible object is
     *     {@link Le }
     *     
     */
    public Le getLe() {
        return le;
    }

    /**
     * Sets the value of the le property.
     * 
     * @param value
     *     allowed object is
     *     {@link Le }
     *     
     */
    public void setLe(Le value) {
        this.le = value;
    }

    /**
     * Gets the value of the gt property.
     * 
     * @return
     *     possible object is
     *     {@link Gt }
     *     
     */
    public Gt getGt() {
        return gt;
    }

    /**
     * Sets the value of the gt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gt }
     *     
     */
    public void setGt(Gt value) {
        this.gt = value;
    }

    /**
     * Gets the value of the ge property.
     * 
     * @return
     *     possible object is
     *     {@link Ge }
     *     
     */
    public Ge getGe() {
        return ge;
    }

    /**
     * Sets the value of the ge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ge }
     *     
     */
    public void setGe(Ge value) {
        this.ge = value;
    }

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link Eq }
     *     
     */
    public Eq getEq() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eq }
     *     
     */
    public void setEq(Eq value) {
        this.eq = value;
    }

    /**
     * Gets the value of the nq property.
     * 
     * @return
     *     possible object is
     *     {@link Nq }
     *     
     */
    public Nq getNq() {
        return nq;
    }

    /**
     * Sets the value of the nq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nq }
     *     
     */
    public void setNq(Nq value) {
        this.nq = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link And }
     *     
     */
    public And getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link And }
     *     
     */
    public void setAnd(And value) {
        this.and = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link Or }
     *     
     */
    public Or getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link Or }
     *     
     */
    public void setOr(Or value) {
        this.or = value;
    }

    /**
     * Gets the value of the not property.
     * 
     * @return
     *     possible object is
     *     {@link Not }
     *     
     */
    public Not getNot() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     * @param value
     *     allowed object is
     *     {@link Not }
     *     
     */
    public void setNot(Not value) {
        this.not = value;
    }

    /**
     * Gets the value of the ifthen property.
     * 
     * @return
     *     possible object is
     *     {@link Ifthen }
     *     
     */
    public Ifthen getIfthen() {
        return ifthen;
    }

    /**
     * Sets the value of the ifthen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ifthen }
     *     
     */
    public void setIfthen(Ifthen value) {
        this.ifthen = value;
    }

    /**
     * Gets the value of the switch property.
     * 
     * @return
     *     possible object is
     *     {@link Ifthen.Switch }
     *     
     */
    public Ifthen.Switch getSwitch() {
        return _switch;
    }

    /**
     * Sets the value of the switch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ifthen.Switch }
     *     
     */
    public void setSwitch(Ifthen.Switch value) {
        this._switch = value;
    }

    /**
     * Gets the value of the interpolate1D property.
     * 
     * @return
     *     possible object is
     *     {@link Interpolate1D }
     *     
     */
    public Interpolate1D getInterpolate1D() {
        return interpolate1D;
    }

    /**
     * Sets the value of the interpolate1D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpolate1D }
     *     
     */
    public void setInterpolate1D(Interpolate1D value) {
        this.interpolate1D = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

}
