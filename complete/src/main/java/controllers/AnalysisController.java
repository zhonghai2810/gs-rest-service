package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import DTO.AnalysisInfoDTO;
import DTO.DownstreamInfoDTO;
import DTO.UpstreamInfoDTO;
import DTO.TianYanChaInfoDTO;
import Entity.*;
import com.gvt.riskservice.Greeting;
import com.gvt.riskservice.InputInfo;
import com.gvt.riskservice.ValidTokens;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import result.*;

@Api(tags = "风控服务模块")
@RestController
public class AnalysisController {

	private static final Logger logger = LoggerFactory.getLogger(AnalysisController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@ApiOperation(value = "PING")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@ApiOperation(value = "获取借款方平台征信信息")
	@PostMapping(value = "/ana-risk",  consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public ResultByType<AnalysisInfoDTO> analyze(@RequestBody @ApiParam(name = "body", value = "JSON格式") InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new ResultByType(resultCode);
		}

		float riskLevel = 0.0f;
		String result = AnalysisInfo.Result.ACCEPT.toString();

		AnalysisInfo analysisInfo = new AnalysisInfo();
		analysisInfo.setAverageLoanPeriod(20);
		analysisInfo.setAveragePayOffPeriod(30);
		analysisInfo.setLoanOrders(140);
		analysisInfo.setOverdueCount(0);
		analysisInfo.setRiskLevel(0.0f);
		analysisInfo.setScore(98);
		analysisInfo.setTotalLoanAmount(250000);
		analysisInfo.setResult(result);

		AnalysisInfoDTO analysisInfoDTO = new AnalysisInfoDTO();
		analysisInfoDTO.setAverageLoanPeriod(analysisInfo.getAverageLoanPeriod());
		analysisInfoDTO.setAveragePayOffPeriod(analysisInfo.getAveragePayOffPeriod());
		analysisInfoDTO.setLoanOrders(analysisInfo.getLoanOrders());
		analysisInfoDTO.setOverdueCount(analysisInfo.getOverdueCount());
		analysisInfoDTO.setScore(analysisInfo.getScore());
		analysisInfoDTO.setTotalLoanAmount(analysisInfo.getTotalLoanAmount());

		logger.info("SUCCESS -- {} -- {}", riskLevel, result);
		return new ResultByType("200", analysisInfoDTO);
	}

	@ApiOperation(value = "获取借款方工商信息")
	@PostMapping(value = "/commercial-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public ResultByType<TianYanChaInfoDTO> getCommercialInfo(@RequestBody @ApiParam(name = "body", value = "JSON格式") InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new ResultByType(resultCode);
		}

		TianYanChaInfo tianYanChaInfo = new TianYanChaInfo();
		tianYanChaInfo.setCompanyName("深圳璨宇贸易有限公司");
		tianYanChaInfo.setAddress("深圳市南山区西丽街道新围社区同沙路168号凯达尔集团中心大厦1号楼十九层1902");
		tianYanChaInfo.setTelephone("1581748****");
		tianYanChaInfo.setEmail("zj@gvt861.com");
		tianYanChaInfo.setWebsite("www.epicgal.com");

		CommercialInfo commercialInfo = new CommercialInfo();
		commercialInfo.setCompanyName("深圳璨宇贸易有限公司");
		commercialInfo.setLegalRepresentative("曲盛");
		commercialInfo.setRegisteredCapital("500万人民币");
		commercialInfo.setPaidUpCapital("-");
		commercialInfo.setFundDate("2018-08-06");
		commercialInfo.setOperationStatus("存续");
		commercialInfo.setUSCC("91440300MA5F8T9U5F");
		commercialInfo.setBusinessRegistrationNo("-");
		commercialInfo.setTaxRegistrationNo("91440300MA5F8T9U5F");
		commercialInfo.setOrganizationNo("MA5F8T9U5");
		commercialInfo.setCompanyType("有限责任公司（法人独资）");
		commercialInfo.setBusinessIndustry("零售业");
		commercialInfo.setAuditDate("2020-01-08");
		commercialInfo.setRegistrationDepartment("深圳市市场监督管理局");
		commercialInfo.setBusinessTerm("2018-08-06至2048-08-08");
		commercialInfo.setTaxPayerQualification("-");
		commercialInfo.setEmployeeSize("小于50人");
		commercialInfo.setInsuredEmployeeSize(26);
		commercialInfo.setOldCompanyName("-");
		commercialInfo.setEnglishName("-");

		tianYanChaInfo.setCommercialInfo(commercialInfo);

		TianYanChaInfoDTO tianYanChaInfoDTO = new TianYanChaInfoDTO();
		tianYanChaInfoDTO.setCompanyName(tianYanChaInfo.getCompanyName());
		tianYanChaInfoDTO.setFundDate(tianYanChaInfo.getCommercialInfo().getFundDate());
		tianYanChaInfoDTO.setLegalRepresentative(tianYanChaInfo.getCommercialInfo().getLegalRepresentative());

		logger.info("SUCCESS -- {}", tianYanChaInfo.getCompanyName());
		return new ResultByType("200", tianYanChaInfoDTO);
	}

	@ApiOperation(value = "获取借款方经营数据报表")
	@PostMapping(value = "/operation-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public ResultByType<OperationInfo> getOperationInfo(@RequestBody @ApiParam(name = "body", value = "JSON格式") InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new ResultByType(resultCode);
		}

		OperationInfo operationInfo = new OperationInfo();
		operationInfo.setSaleAmount(5000000);
		operationInfo.setSaleOrderCount(18000);
		operationInfo.setAverageAmountOfOrders(277.8);
		operationInfo.setAverageAmountOfPurchases(533.3);
		operationInfo.setPurchaseAmount(8000000);
		operationInfo.setPurchaseOrderCount(15000);
		operationInfo.setRateOfGrossProfit(0.55);

		logger.info("SUCCESS -- {}", operationInfo.getSaleAmount());
		return new ResultByType("200", operationInfo);

	}

	@ApiOperation(value = "获取借款方上游采购交易信息")
	@PostMapping(value = "/upstream-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public ResultByType<List<UpstreamInfoDTO>> getUpstreamInfo(@RequestBody @ApiParam(name = "body", value = "JSON格式") InputInfo inputInfo) {
		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new ResultByType(resultCode);
		}

		UpstreamInfo upstreamInfo = new UpstreamInfo();

		CommercialInfo commercialInfo = new CommercialInfo();
		commercialInfo.setLegalRepresentative("John");
		commercialInfo.setRegisteredCapital("1000万");

		TianYanChaInfo tianYanChaInfo = new TianYanChaInfo();
		tianYanChaInfo.setCompanyName("澳洲八喜贸易有限公司");
		tianYanChaInfo.setCommercialInfo(commercialInfo);

		upstreamInfo.setUpstreamSupplierInfo(tianYanChaInfo);
		upstreamInfo.setAverageDeliveryTime(3);
		upstreamInfo.setPaymentPeriod(30);
		upstreamInfo.setPurchaseAmount(1456000);

		TradeInfo tradeInfo1 = new TradeInfo("A2奶粉1段", "GVT120001", 350, 179.99, 62996.5, "批发价");
		TradeInfo tradeInfo2 = new TradeInfo("A2奶粉2段", "GVT120002", 150, 159.99, 23998.5, "批发价");
		TradeInfo tradeInfo3 = new TradeInfo("A2奶粉3段", "GVT120003", 50, 169.99, 8499.5, "折扣价");

		List<TradeInfo> tradeInfoList = new ArrayList<>();
		tradeInfoList.add(tradeInfo1);
		tradeInfoList.add(tradeInfo2);
		tradeInfoList.add(tradeInfo3);

//		Map<String, List<TradeInfo>> commercialInfoListMap = new HashMap<>();
//		commercialInfoListMap.put(upstreamInfo.getUpstreamSupplierInfo().getCompanyName(), tradeInfoList);
//
//		List<Map<String, List<TradeInfo>>> upstreamTradeList = new ArrayList<>();
//		upstreamTradeList.add(commercialInfoListMap);

		UpstreamInfoDTO upstreamInfoDTO = new UpstreamInfoDTO();
		upstreamInfoDTO.setUpstreamCompanyName(tianYanChaInfo.getCompanyName());
		upstreamInfoDTO.setAverageDeliveryTime(upstreamInfo.getAverageDeliveryTime());
		upstreamInfoDTO.setLegalRepresentative(upstreamInfo.getUpstreamSupplierInfo().getCommercialInfo().getLegalRepresentative());
		upstreamInfoDTO.setPaymentPeriod(upstreamInfo.getPaymentPeriod());
		upstreamInfoDTO.setPurchaseAmount(upstreamInfo.getPurchaseAmount());
		upstreamInfoDTO.setRegisteredCapital(upstreamInfo.getUpstreamSupplierInfo().getCommercialInfo().getRegisteredCapital());
		upstreamInfoDTO.setTradeInfos(tradeInfoList);

		List<UpstreamInfoDTO> upstreamInfoDTOList = new ArrayList<>();
		upstreamInfoDTOList.add(upstreamInfoDTO);

		logger.info("SUCCESS -- {}", upstreamInfo.getUpstreamSupplierInfo().getCompanyName());
		return new ResultByType("200", upstreamInfoDTOList);

	}

	@ApiOperation(value = "获取借款方下游平台交易信息")
	@PostMapping(value = "/downstream-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public ResultByType<List<DownstreamInfoDTO>> getDownstreamInfo(@RequestBody @ApiParam(name = "body", value = "JSON格式") InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new ResultByType(resultCode);
		}

		DownstreamInfo downstreamInfo = new DownstreamInfo();
		downstreamInfo.setSkuCount(120);
		downstreamInfo.setProductSoldTotal(16500);
		downstreamInfo.setAmountSoldTotal(1600000);

		ChannelInfo channelInfo = new ChannelInfo();
		channelInfo.setPlatformName("京东");
		downstreamInfo.setDownstreamChannelInfo(channelInfo);

		TradeInfo tradeInfo1 = new TradeInfo("A2奶粉1段", "GVT120001", 50, 279.99, 13999.5, "正常价");
		TradeInfo tradeInfo2 = new TradeInfo("A2奶粉2段", "GVT120002", 100, 259.99, 25999, "做活动");
		TradeInfo tradeInfo3 = new TradeInfo("A2奶粉3段", "GVT120003", 30, 269.99, 8099.7, "618");

		List<TradeInfo> tradeInfoList = new ArrayList<>();

		tradeInfoList.add(tradeInfo1);
		tradeInfoList.add(tradeInfo2);
		tradeInfoList.add(tradeInfo3);

//		Map<String, List<TradeInfo>> channelInfoListMap = new HashMap<>();
//		channelInfoListMap.put(downstreamInfo.getDownstreamChannelInfo().getPlatformName(), tradeInfoList);
//
//		List<Map<String, List<TradeInfo>>> downstreamTradeList = new ArrayList<>();
//		downstreamTradeList.add(channelInfoListMap);

		DownstreamInfoDTO downstreamInfoDTO = new DownstreamInfoDTO();
		downstreamInfoDTO.setAmountSoldTotal(downstreamInfo.getAmountSoldTotal());
		downstreamInfoDTO.setProductSoldTotal(downstreamInfo.getProductSoldTotal());
		downstreamInfoDTO.setSkuCount(downstreamInfo.getSkuCount());
		downstreamInfoDTO.setDownstreamChannelName(downstreamInfo.getDownstreamChannelInfo().getPlatformName());
		downstreamInfoDTO.setTradeInfos(tradeInfoList);

		List<DownstreamInfoDTO> downstreamInfoDTOList = new ArrayList<>();
		downstreamInfoDTOList.add(downstreamInfoDTO);

		logger.info("SUCCESS -- {}", downstreamInfo.getDownstreamChannelInfo().getPlatformName());

		return new ResultByType("200", downstreamInfoDTOList);

	}

}
