package srbrettle.financialformulas;

import junit.framework.Assert;
import org.junit.Test;

public class FinancialFormulasTest {

    @Test
    public void AssetTurnover_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcAssetTurnover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void AverageCollectionPeriod_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcAverageCollectionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void CashConversionCycle_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcCashConversionCycle(500,200,100);
        Assert.assertEquals(600.0,result);
    }

    @Test
    public void InventoryConversionPeriod_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcInventoryConversionPeriod(365);
        Assert.assertEquals(1.0,result);
    }

    @Test
    public void InventoryConversionRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcInventoryConversionRatio(500,200);
        Assert.assertEquals(1.25,result);
    }

    @Test
    public void InventoryTurnover_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcInventoryTurnover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PayablesConversionPeriod_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcPayablesConversionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void ReceivablesConversionPeriod_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReceivablesConversionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void ReceivablesTurnoverRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReceivablesTurnoverRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void GrossProfit_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcGrossProfit(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void Liabilities_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcLiabilities(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void NetProfit_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcNetProfit(500,200,100,100);
        Assert.assertEquals(100.0,result);
    }

    @Test
    public void OperatingProfit_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcOperatingProfit(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void SalesRevenue_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcSalesRevenue(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void DebtEquityRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDebtEquityRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DebtRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDebtRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DebtServiceCoverageRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDebtServiceCoverageRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void LongTermDebtEquityRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcLongTermDebtEquityRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void BookValue_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcBookValue(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void DecliningBalance_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDecliningBalance(0.5,200);
        Assert.assertEquals(100.0,result);
    }

    @Test
    public void UnitsOfProduction_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcUnitsOfProduction(500,200,100,150);
        Assert.assertEquals(450.0,result);
    }

    @Test
    public void StraightLineMethod_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcStraightLineMethod(500,200, 10);
        Assert.assertEquals(30.0,result);
    }

    @Test
    public void CashRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcCashRatio(500,200, 100);
        Assert.assertEquals(7.0,result);
    }

    @Test
    public void CurrentRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcCurrentRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void OperatingCashFlowRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcOperatingCashFlowRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void QuickRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcQuickRatio(500,200,100);
        Assert.assertEquals(3.0,result);
    }

    @Test
    public void DividendCover_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDividendCover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DividendsPerShare_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDividendsPerShare(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DividendYield_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcDividendYield(5,200);
        Assert.assertEquals(0.025,result);
    }

    @Test
    public void EarningsPerShare_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcEarningsPerShare(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PayoutRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcPayoutRatio(500,10000);
        Assert.assertEquals(0.05,result);
    }

    @Test
    public void PegRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcPegRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PriceSalesRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcPriceSalesRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void EfficiencyRatio_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcEfficiencyRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void GrossProfitMargin_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcGrossProfitMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void OperatingMargin_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcOperatingMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ProfitMargin_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcProfitMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnAssets_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReturnOnAssets(500,200);
        Assert.assertEquals(2.50,result);
    }

    @Test
    public void ReturnOnCapital_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReturnOnCapital(500,0.2, 100);
        Assert.assertEquals(4.0,result);
    }

    @Test
    public void ReturnOnEquity_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReturnOnEquity(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnNetAssets_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReturnOnNetAssets(500,200,50);
        Assert.assertEquals(2.0,result);
    }

    @Test
    public void RiskAdjustedReturnOnCapital_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcRiskAdjustedReturnOnCapital(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnInvestment_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcReturnOnInvestment(500,200);
        Assert.assertEquals(1.5,result);
    }

    @Test
    public void Ebitda_ValidInput_ReturnsCorrect() {
        FinancialFormulas calc = new FinancialFormulas();
        double result = calc.CalcEbitda(500,200,100);
        Assert.assertEquals(800.0,result);
    }

}
