using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace FinancialFormulas.Tests
{
    [TestClass()]
    public class FinancialFormulasTests
    {
        [TestMethod()]
        public void AssetTurnover_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcAssetTurnover(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void AverageCollectionPeriod_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcAverageCollectionPeriod(500, 200);
            Assert.AreEqual(912.5, result);
        }

        [TestMethod()]
        public void CashConversionCycle_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcCashConversionCycle(500, 200, 100);
            Assert.AreEqual(600.0, result);
        }

        [TestMethod()]
        public void InventoryConversionPeriod_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcInventoryConversionPeriod(365);
            Assert.AreEqual(1.0, result);
        }

        [TestMethod()]
        public void InventoryConversionRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcInventoryConversionRatio(500, 200);
            Assert.AreEqual(1.25, result);
        }

        [TestMethod()]
        public void InventoryTurnover_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcInventoryTurnover(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void PayablesConversionPeriod_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcPayablesConversionPeriod(500, 200);
            Assert.AreEqual(912.5, result);
        }

        [TestMethod()]
        public void ReceivablesConversionPeriod_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReceivablesConversionPeriod(500, 200);
            Assert.AreEqual(912.5, result);
        }

        [TestMethod()]
        public void ReceivablesTurnoverRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReceivablesTurnoverRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void GrossProfit_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcGrossProfit(500, 200);
            Assert.AreEqual(300.0, result);
        }

        [TestMethod()]
        public void Liabilities_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcLiabilities(500, 200);
            Assert.AreEqual(300.0, result);
        }

        [TestMethod()]
        public void NetProfit_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcNetProfit(500, 200, 100, 100);
            Assert.AreEqual(100.0, result);
        }

        [TestMethod()]
        public void OperatingProfit_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcOperatingProfit(500, 200);
            Assert.AreEqual(300.0, result);
        }

        [TestMethod()]
        public void SalesRevenue_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcSalesRevenue(500, 200);
            Assert.AreEqual(300.0, result);
        }

        [TestMethod()]
        public void DebtEquityRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDebtEquityRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void DebtRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDebtRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void DebtServiceCoverageRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDebtServiceCoverageRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void LongTermDebtEquityRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcLongTermDebtEquityRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void BookValue_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcBookValue(500, 200);
            Assert.AreEqual(300.0, result);
        }

        [TestMethod()]
        public void DecliningBalance_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDecliningBalance(0.5, 200);
            Assert.AreEqual(100.0, result);
        }

        [TestMethod()]
        public void UnitsOfProduction_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcUnitsOfProduction(500, 200, 100, 150);
            Assert.AreEqual(450.0, result);
        }

        [TestMethod()]
        public void StraightLineMethod_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcStraightLineMethod(500, 200, 10);
            Assert.AreEqual(30.0, result);
        }

        [TestMethod()]
        public void CashRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcCashRatio(500, 200, 100);
            Assert.AreEqual(7.0, result);
        }

        [TestMethod()]
        public void CurrentRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcCurrentRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void OperatingCashFlowRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcOperatingCashFlowRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void QuickRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcQuickRatio(500, 200, 100);
            Assert.AreEqual(3.0, result);
        }

        [TestMethod()]
        public void DividendCover_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDividendCover(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void DividendsPerShare_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDividendsPerShare(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void DividendYield_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcDividendYield(5, 200);
            Assert.AreEqual(0.025, result);
        }

        [TestMethod()]
        public void EarningsPerShare_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcEarningsPerShare(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void PayoutRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcPayoutRatio(500, 10000);
            Assert.AreEqual(0.05, result);
        }

        [TestMethod()]
        public void PegRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcPegRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void PriceSalesRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcPriceSalesRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void EfficiencyRatio_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcEfficiencyRatio(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void GrossProfitMargin_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcGrossProfitMargin(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void OperatingMargin_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcOperatingMargin(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void ProfitMargin_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcProfitMargin(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void ReturnOnAssets_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReturnOnAssets(500, 200);
            Assert.AreEqual(2.50, result);
        }

        [TestMethod()]
        public void ReturnOnCapital_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReturnOnCapital(500, 0.2, 100);
            Assert.AreEqual(4.0, result);
        }

        [TestMethod()]
        public void ReturnOnEquity_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReturnOnEquity(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void ReturnOnNetAssets_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReturnOnNetAssets(500, 200, 50);
            Assert.AreEqual(2.0, result);
        }

        [TestMethod()]
        public void RiskAdjustedReturnOnCapital_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcRiskAdjustedReturnOnCapital(500, 200);
            Assert.AreEqual(2.5, result);
        }

        [TestMethod()]
        public void ReturnOnInvestment_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcReturnOnInvestment(500, 200);
            Assert.AreEqual(1.5, result);
        }

        [TestMethod()]
        public void Ebitda_ValidInput_ReturnsCorrect()
        {
            FinancialFormulas calc = new FinancialFormulas();
            double result = calc.CalcEbitda(500, 200, 100);
            Assert.AreEqual(800.0, result);
        }
    }
}
