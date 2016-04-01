package sajal.code.org.naturetip;

/**
 * Created by Sajal Tyagi on 20-03-2016.
 */
public class DailyTips {
    String[] tips;
    int returnIndex;

    public DailyTips() {
        tips = new String[60];

        tips[0] = "Drive less : Travel small distances on foot or take your bicycle;take public transport or carpool.";
        tips[1] = "Eat vegetarian meals more often as it requires much less energy to produce, so eating meat-free meals every other day = annual CO2 savings of 487 pounds.";
        tips[2] = "Avoid aggressive driving as “Jack-rabbit” starts and hard braking can increase fuel consumption by as much as 40%.";
        tips[3] = "Plastic/paper bags should be reused until they’re worn out and then recycled. Many grocery stores now have a recycle bin for plastic bags.";
        tips[4] = "Drink water out of a reusable container rather than always buying water bottles.";
        tips[5] = "Use rechargeable batteries and electronic items and never leave them on indefinitely overnight. Recharge them and then unplug them so as not to waste energy.";
        tips[6] = "Never use open fires to dispose of waste, especially chemicals and plastic.";
        tips[7] = "Keep your car in good running condition to avoid emissions. Get it tested for pollution after every fixed interval.";
        tips[8] = "Stop smoking or don't throw your butts on the ground. Cigarette butts are not biodegradable and contain extremely toxic soluble chemicals.\n" + " One butt thrown on the ground can remain for up to 25 years, leaking chemicals like arsenic, ammonia, acetone, benzene, cadmium, formaldehyde, lead, and toluene into the environment.";
        tips[9] = "Always bring a bag when you shop.";
        tips[10] = "Plant more trees. They clean the air, provide oxygen, and beautify your surroundings.";
        tips[11] = "Change your vehicle's engine oil every 5000-8000km.";
        tips[12] = "Use compact fluorescent light bulbs. They use less energy than a normal incandescent and have a longer life.";
        tips[13] = "Recycle old cell phones. There are plenty of reputable programs where one can recycle the cell phone.";
        tips[14] = "Turn off lights when not in use.";
        tips[15] = "Use a wet cloth to wash your car instead of a hose pipe.";
        tips[16] = "When driving, accelerate gradually and obey the speed limit.";
        tips[17] = "When ready to replace, look for Energy Star appliances.";
        tips[18] = "Grow native or other low-water plants for fresh healthy air to breathe.";
        tips[19] = "Print and photocopy on both sides of paper. Save Paper Save Trees.";
        tips[20] = "If you need to use a professional printer, use one that has a FSC (Forest Stewardship Council) certification.";
        tips[21] = "Use online auction sites such as Olx , preloved (UK) and ebay to sell unwanted items.";
        tips[22] = "Donate useful items to charity shops , orphanages and to the needy ones.";
        tips[23] = "Paint with a brush instead of a sprayer.";
        tips[24] = "Opt for a fan or a cooler instead of air conditioning. ";
        tips[25] = "When purchasing a new car, consider one that is the most efficient, lowest-polluting vehicle or even a zero-emission electric car. ";
        tips[26] = "Drive less, particularly on days with unhealthful air quality.";
        tips[27] = "Eat locally, shop at farmer’s markets and buy organic produce.";
        tips[28] = "Adopt the 4 Rs : Reduce , Reuse , Recycling and Recovery. Reduction, Reuse and Recycling are known in the industry as the 3Rs.";
        tips[29] = "Inculcate the habit of Sustainability in your lifestyle. ";
        tips[30] = "Don't use plastic bags, buy a rucksack or other bag to use for your shopping.";
        tips[31] = "Use refills and products that allow refills. This will reduce packaging and waste.";
        tips[32] = "Manage your bank, credit card and utility accounts online and use paperless banking. It's a lot easier and it saves paper which saves waste, natural resources and energy.";
        tips[33] = "Say a big NO to pesticides and GMOs (genetically modified organisms).";
        tips[34] = "Take care to properly dispose of your pet's waste.";
        tips[35] = "Do not litter. Start an anti-litter campaign to educate your community.";
        tips[36] = "Use sustainable, reclaimed, or recycled building materials.";
        tips[37] = "Start composting leaves and clippings from your yard and food scraps from your kitchen to reduce waste while improving your soil.";
        tips[38] = "Do not idle your car for more than 10 seconds. Idling for longer than 10 seconds uses more fuel than restarting your vehicle.";
        tips[39] = "Make sure your tires are properly inflated to prevent increased rolling resistance. Under-inflated tires can cause fuel consumption to increase by as much as 6%.";
        tips[40] = "If your car has an air conditioner, make sure you recycle its coolant whenever you have it serviced. You can save thousands of pounds of carbon dioxide each year by doing this.";
        tips[41] = "Take the stairs instead of the elevator";
        tips[42] = "Recycle as much as possible. Recycle aluminum cans, glass bottles, plastic, cardboard and newspapers = CO2 savings of 850 pounds.";
        tips[43] = "Turn lights off unnecessary lights and appliances.";
        tips[44] = "When turning on your air conditioner, avoid using the coldest setting.";
        tips[45] = "Paint your home a light color if you live in a warm climate, or a dark color in a cold climate. This can contribute saving up to 5000 pounds of carbon dioxide per year.";
        tips[46] = "Wash your clothes in cold or warm water rather than hot. The rinse temperature doesn't affect the quality of the cleaning.";
        tips[47] = "Do not use chlorine bleach or other harsh chemicals (so avoid dry-cleaning!).";
        tips[48] = "Use fewer chemicals when cleaning your house. (Hint: Baking soda, vinegar & lemon juice are great SAFE cleaners!)";
        tips[49] = "If you own a business, make sure you have considered the environmental impact of your business practices. \n" + "If you work for someone else, take the time to assess your company's environmental impact and try to implement positive change.";
        tips[50] = "Make sure your tires are inflate driving with inflated tires redues your gas mileage by 3% ";
        tips[51] = "i just bought a bag of potato chips. It was a smart buy, because when this world runs out of clean air, I'll have plenty in that one little purchase";
        tips[52] = "one must be a sea, to receive a polluted stream without becoming impure.";
        tips[53] = "water and air, the two essential fluids on which all life depends, have become global garbage cans.";
        tips[54] = "like a man, who's been dying for many days, a man in your city is numb to the stench";
        tips[55] = "because normal human activity is worse for nature than the greatest nuclear accidents in history.";
        tips[56] = "love is in the air, but the air is highly polluted";
        tips[57] = "use mass transit carpool, walking, biking; it can reduce greenhouse gas emissions by 0.2 to 0.8 tonnes per year";
        tips[58] = "you wouldn't think we could kill the ocean? we will. that's how negligent we are  ";
        tips[59] = "the living sinners on deadly ground";

    }

    String myTips() {

        returnIndex = (int) (Math.random() * tips.length);
        return tips[returnIndex];
    }

}
